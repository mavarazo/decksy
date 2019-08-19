package com.decksy.controller;

import com.decksy.dto.CardCriteriaDto;
import com.decksy.model.Card;
import com.decksy.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cards")
public class CardController {

  @Autowired private CardService cardService;

  @PostMapping(value = "/search")
  public String search(
      @Valid @RequestBody CardCriteriaDto criteriaDto, Errors errors, Model model) {
    if (errors.hasErrors()) {
      model.addAttribute("msg", errors.toString());
    }

    List<Card> result = cardService.fetchCardByName(criteriaDto.getName());
    List<Object> cards =
        result.stream()
            .map(
                r -> {
                  Card card = cardService.findByMultiverseId(r.getMultiverseId());
                  return Objects.nonNull(card) ? card : r;
                })
            .collect(Collectors.toList());

    model.addAttribute("cards", cards);
    return "cards/fragments :: search-result";
  }
}

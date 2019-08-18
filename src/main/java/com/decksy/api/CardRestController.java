package com.decksy.api;

import com.decksy.dto.CardCriteriaDto;
import com.decksy.model.Card;
import com.decksy.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardRestController {

  @Autowired private CardService cardService;

  @PostMapping(value = "/")
  public ResponseEntity<?> search(@Valid @RequestBody CardCriteriaDto criteriaDto, Errors errors) {
     if (errors.hasErrors()) {
        return ResponseEntity.badRequest().body(errors.toString());
     }

     if (StringUtils.isEmpty(criteriaDto.getName())) {
        return ResponseEntity.badRequest().body("Name is mandatory");
     }

     List<Card> result = cardService.fetchCardByName(criteriaDto.getName());
     return ResponseEntity.ok(result);
  }
}

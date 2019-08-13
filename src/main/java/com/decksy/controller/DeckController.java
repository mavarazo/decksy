package com.decksy.controller;

import com.decksy.model.Deck;
import com.decksy.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/deck")
public class DeckController {

   @Autowired private DeckService deckService;

   @GetMapping(value = "/")
   public String index(Model model) {
      model.addAttribute("deck", new Deck());
      return "deck/index";
   }

   @GetMapping(value = "/{id}")
   public String show(@PathVariable long id, Model model) {
      Optional<Deck> deck = deckService.findById(id);
      if (!deck.isPresent()) {
         return "redirect:/deck/";
      }

      model.addAttribute("deck", deck.get());
      return "deck/deck";
   }

   @PostMapping(value = "/")
   public String create(@Valid Deck deck, BindingResult result) {
      if (result.hasErrors()) {
         return "deck/index";
      }

      return "redirect:/deck/" + deckService.save(deck).getId();
   }


}

package com.decksy.api;

import com.decksy.model.Deck;
import com.decksy.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/deck")
public class DeckRestController {

   @Autowired private DeckService deckService;

   @GetMapping(value = "/")
   public List<Deck> findAll() {
      return deckService.findAll();
   }

   @GetMapping(value = "/{id}")
   public Optional<Deck> findAll(@PathVariable("id") long id) {
      return deckService.findById(id);
   }

}

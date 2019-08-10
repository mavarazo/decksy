package com.decksy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deck")
public class DeckController {

   @GetMapping(value = "/")
   public String index(Model model) {
      return "deck/index";
   }

}

package com.mav.decksy.controller.article;

import java.util.Collections;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/articles")
public class ArticleController {

  @GetMapping(value = "/")
  public String index(Model model) {
    model.addAttribute("articles", Collections.emptyList());
    return "articles/index";
  }
}

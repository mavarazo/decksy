package com.mav.decksy.controller.article;

import com.mav.decksy.service.ArticleService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/articles")
public class ArticleRestController {

  private final ArticleService articleService;

  public ArticleRestController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<ArticleDto>> findAll() {
    List<ArticleDto> articles = articleService.findAll();
    return new ResponseEntity<>(articles, HttpStatus.OK);
  }
}

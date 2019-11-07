package com.decksy.controller;

import com.decksy.domain.Article;
import com.decksy.repository.ArticleRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import java.util.List;

@Validated
@Controller("/stocks")
public class StockContoller {

  private final ArticleRepository articleRepository;

  StockContoller(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @Get("/")
  List<Article> all() {
    return articleRepository.findAll();
  }

  @Get("/")
  void bingo() {
  }
}

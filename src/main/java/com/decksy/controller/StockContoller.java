package com.decksy.controller;

import com.decksy.api.mkm.account.AccountServiceImpl;
import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.stock.StockServiceImpl;
import com.decksy.domain.Article;
import com.decksy.repository.ArticleRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import java.io.IOException;
import java.util.List;

@Validated
@Controller("/stocks")
public class StockContoller {

  private final ArticleRepository articleRepository;
  private final StockServiceImpl stockService;

  StockContoller(ArticleRepository articleRepository, StockServiceImpl stockService) {
    this.articleRepository = articleRepository;
    this.stockService = stockService;
  }

  @Get("/")
  List<Article> all() {
    return articleRepository.findAll();
  }

  @Get("/fetch")
  String fetch() throws IOException, HttpException {
    return stockService.getStock().toString();
  }
}

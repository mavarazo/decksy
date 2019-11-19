package com.decksy.controller;

import com.decksy.api.mkm.account.AccountServiceImpl;
import com.decksy.api.mkm.HttpException;
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
  private final AccountServiceImpl accountService;

  StockContoller(ArticleRepository articleRepository, AccountServiceImpl accountService) {
    this.articleRepository = articleRepository;
    this.accountService = accountService;
  }

  @Get("/")
  List<Article> all() {
    return articleRepository.findAll();
  }

  @Get("/fetch")
  String fetch() throws IOException, HttpException {
    return accountService.get_account().toString();
  }
}

package com.decksy.controller.article;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.marketplace.MarketPlaceService;
import com.decksy.service.ArticleService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;

@Validated
@Controller("/articles")
public class ArticleController {

  private final ArticleService articleService;
  private final MarketPlaceService marketPlaceService;

  ArticleController(ArticleService articleService, MarketPlaceService marketPlaceService) {
    this.articleService = articleService;
    this.marketPlaceService = marketPlaceService;
  }

  @Get("/")
  @View("/articles/index")
  HttpResponse index() throws IOException, HttpException {
    Map<String, Object> model = new HashMap();
    model.put("articles", articleService.findAll());
    return HttpResponse.ok(model);
  }
}

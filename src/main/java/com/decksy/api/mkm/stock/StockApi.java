package com.decksy.api.mkm.stock;

import com.decksy.api.mkm.HttpException;
import com.decksy.service.ArticleService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import java.io.IOException;
import java.util.List;

@Controller
public class StockApi {

  private final StockService stockService;
  private final ArticleService articleService;

  StockApi(StockService stockService, ArticleService articleService) {
    this.stockService = stockService;
    this.articleService = articleService;
  }

  public HttpResponse get() throws IOException, HttpException {
    List<Article> mkmArticles = stockService.getStock();
    articleService.save(mkmArticles);
    return HttpResponse.ok();
  }
}

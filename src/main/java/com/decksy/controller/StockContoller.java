package com.decksy.controller;

import java.io.IOException;
import java.util.List;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.stock.StockServiceImpl;
import com.decksy.domain.Article;
import com.decksy.domain.ArticleMapper;
import com.decksy.domain.Price;
import com.decksy.domain.Product;
import com.decksy.domain.ProductMapper;
import com.decksy.repository.ArticleRepository;
import com.decksy.repository.PriceRepository;
import com.decksy.repository.ProductRepository;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

@Validated
@Controller("/stock")
public class StockContoller {

  private final ArticleRepository articleRepository;
  private final PriceRepository priceRepository;
  private final ProductRepository productRepository;
  private final StockServiceImpl stockService;

  StockContoller(
      ArticleRepository articleRepository,
      PriceRepository priceRepository,
      ProductRepository productRepository,
      StockServiceImpl stockService) {
    this.articleRepository = articleRepository;
    this.priceRepository = priceRepository;
    this.productRepository = productRepository;
    this.stockService = stockService;
  }

  @Get("/")
  List<Article> all() {
    return articleRepository.findAll();
  }

  @Get("/mkm")
  List<Article> mkmStock() throws IOException, HttpException {
    List<com.decksy.api.mkm.stock.Article> mkmArticles = stockService.getStock();
    mkmArticles.stream()
        .forEach(
            mkmArticle -> {
              Price price = priceRepository.save(new Price().setPrice(mkmArticle.getPrice()));

              Product product =
                  productRepository.save(
                      ProductMapper.INSTANCE
                          .toDomain(mkmArticle.getProduct())
                          .setProductId(mkmArticle.getIdProduct()));

              articleRepository.save(
                  ArticleMapper.INSTANCE.toDomain(mkmArticle).addPrice(price).setProduct(product));
            });

    return articleRepository.findAll();
  }
}

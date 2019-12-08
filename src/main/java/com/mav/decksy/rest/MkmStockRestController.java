package com.mav.decksy.rest;

import com.mav.decksy.api.mkm.stock.Article;
import com.mav.decksy.api.mkm.stock.StockService;
import com.mav.decksy.controller.article.ArticleMapper;
import com.mav.decksy.controller.article.ProductMapper;
import com.mav.decksy.model.Price;
import com.mav.decksy.model.Product;
import com.mav.decksy.repository.ArticleRepository;
import com.mav.decksy.repository.PriceRepository;
import com.mav.decksy.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/mkm/stock")
public class MkmStockRestController {

  private final StockService stockService;
  private final ArticleRepository articleRepository;
  private final PriceRepository priceRepository;
  private final ProductRepository productRepository;

  @Autowired
  MkmStockRestController(
      StockService stockService,
      ArticleRepository articleRepository,
      PriceRepository priceRepository,
      ProductRepository productRepository) {
    this.stockService = stockService;
    this.articleRepository = articleRepository;
    this.priceRepository = priceRepository;
    this.productRepository = productRepository;
  }

  @GetMapping(value = "/")
  public void get() {
    List<Article> mkmArticles = stockService.getStock();

    mkmArticles.forEach(
        mkmArticle -> {
          com.mav.decksy.model.Article article =
              articleRepository.save(ArticleMapper.INSTANCE.toModel(mkmArticle));

          Price price = new Price().setPrice(mkmArticle.getPrice()).setArticle(article);
          priceRepository.save(price);

          Product product =
              ProductMapper.INSTANCE
                  .toModel(mkmArticle.getProduct())
                  .setArticle(article)
                  .setProductId(mkmArticle.getIdProduct());
          productRepository.save(product);
        });
  }
}

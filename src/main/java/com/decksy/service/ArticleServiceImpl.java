package com.decksy.service;

import com.decksy.controller.article.ArticleMapper;
import com.decksy.controller.article.ProductMapper;
import com.decksy.domain.Price;
import com.decksy.domain.Product;
import com.decksy.repository.ArticleRepository;
import com.decksy.repository.PriceRepository;
import com.decksy.repository.ProductRepository;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public class ArticleServiceImpl implements ArticleService {

  private final ArticleRepository articleRepository;
  private final PriceRepository priceRepository;
  private final ProductRepository productRepository;

  public ArticleServiceImpl(
      ArticleRepository articleRepository,
      PriceRepository priceRepository,
      ProductRepository productRepository) {
    this.articleRepository = articleRepository;
    this.priceRepository = priceRepository;
    this.productRepository = productRepository;
  }

  @Override
  public void save(List<com.decksy.api.mkm.stock.Article> mkmArticles) {
    mkmArticles.forEach(
        mkmArticle -> {
          com.decksy.domain.Article article =
              articleRepository.save(ArticleMapper.INSTANCE.toDomain(mkmArticle));

          Price price = new Price().setPrice(mkmArticle.getPrice()).setArticle(article);
          priceRepository.save(price);

          Product product =
              ProductMapper.INSTANCE
                  .toDomain(mkmArticle.getProduct())
                  .setArticle(article)
                  .setProductId(mkmArticle.getIdProduct());
          productRepository.save(product);
        });
  }
}

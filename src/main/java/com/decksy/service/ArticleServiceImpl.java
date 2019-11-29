package com.decksy.service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Singleton;

import com.decksy.api.mkm.marketplace.MarketPlaceService;
import com.decksy.controller.article.ArticleDto;
import com.decksy.controller.article.ArticleMapper;
import com.decksy.controller.article.PriceDto;
import com.decksy.controller.article.PriceGuideDto;
import com.decksy.controller.article.PriceGuideMapper;
import com.decksy.controller.article.ProductMapper;
import com.decksy.domain.Price;
import com.decksy.domain.Product;
import com.decksy.repository.ArticleRepository;
import com.decksy.repository.PriceRepository;
import com.decksy.repository.ProductRepository;

@Singleton
public class ArticleServiceImpl implements ArticleService {

  private final ArticleRepository articleRepository;
  private final PriceRepository priceRepository;
  private final ProductRepository productRepository;
  private final MarketPlaceService marketPlaceService;

  public ArticleServiceImpl(
      ArticleRepository articleRepository,
      PriceRepository priceRepository,
      ProductRepository productRepository,
      MarketPlaceService marketPlaceService) {
    this.articleRepository = articleRepository;
    this.priceRepository = priceRepository;
    this.productRepository = productRepository;
    this.marketPlaceService = marketPlaceService;
  }

  @Override
  public List<ArticleDto> findAll() {
    return articleRepository.findAll().stream()
        .map(
            article -> {
              ArticleDto articleDto = ArticleMapper.INSTANCE.toDto(article);

              getLatestPrice(articleDto)
                  .ifPresent(priceDto -> articleDto.setLatestPrice(priceDto.getPrice()));
              getPriceGuide(articleDto)
                  .ifPresent(priceGuideDto -> articleDto.setPriceGuide(priceGuideDto));
              return articleDto;
            })
        .collect(Collectors.toList());
  }

  private Optional<PriceDto> getLatestPrice(ArticleDto articleDto) {
    return articleDto.getPrices().stream().max(Comparator.comparing(PriceDto::getCreateDateTime));
  }

  private Optional<PriceGuideDto> getPriceGuide(ArticleDto articleDto) {
    Optional<com.decksy.api.mkm.marketplace.Product> mkmProduct =
        marketPlaceService.getProduct(articleDto.getProduct().getProductId());
    if (mkmProduct.isPresent() && Objects.nonNull(mkmProduct.get().getPriceGuide())) {
      return Optional.of(PriceGuideMapper.INSTANCE.toDto(mkmProduct.get().getPriceGuide()));
    }
    return Optional.empty();
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

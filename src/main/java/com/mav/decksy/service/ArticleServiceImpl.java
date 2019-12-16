package com.mav.decksy.service;

import com.mav.decksy.api.mkm.marketplace.MarketPlaceService;
import com.mav.decksy.controller.article.ArticleDto;
import com.mav.decksy.controller.article.ArticleMapper;
import com.mav.decksy.controller.article.PriceDto;
import com.mav.decksy.controller.article.PriceGuideDto;
import com.mav.decksy.controller.article.PriceGuideMapper;
import com.mav.decksy.repository.ArticleRepository;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  private final ArticleRepository articleRepository;
  private final MarketPlaceService marketPlaceService;

  @Autowired
  public ArticleServiceImpl(
      ArticleRepository articleRepository, MarketPlaceService marketPlaceService) {
    this.articleRepository = articleRepository;
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
              return articleDto;
            })
        .sorted(Comparator.comparing(ArticleDto::getLatestPrice).reversed())
        .collect(Collectors.toList());
  }

  private Optional<PriceDto> getLatestPrice(ArticleDto articleDto) {
    return articleDto.getPrices().stream().max(Comparator.comparing(PriceDto::getCreateDateTime));
  }

  private Optional<PriceGuideDto> getPriceGuide(ArticleDto articleDto) {
    Optional<com.mav.decksy.api.mkm.marketplace.Product> mkmProduct =
        marketPlaceService.getProduct(articleDto.getProduct().getProductId());
    if (mkmProduct.isPresent() && Objects.nonNull(mkmProduct.get().getPriceGuide())) {
      return Optional.of(PriceGuideMapper.INSTANCE.toDto(mkmProduct.get().getPriceGuide()));
    }
    return Optional.empty();
  }
}

package com.decksy.controller.article;

import com.decksy.repository.ArticleRepository;
import com.decksy.repository.PriceRepository;
import com.decksy.repository.ProductRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Validated
@Controller("/articles")
public class ArticleController {

  private final ArticleRepository articleRepository;
  private final PriceRepository priceRepository;
  private final ProductRepository productRepository;

  ArticleController(
      ArticleRepository articleRepository,
      PriceRepository priceRepository,
      ProductRepository productRepository) {
    this.articleRepository = articleRepository;
    this.priceRepository = priceRepository;
    this.productRepository = productRepository;
  }

  @Get("/")
  @View("/articles/index")
  HttpResponse index() {
    List<ArticleDto> articles =
        articleRepository.findAll().stream()
            .map(
                article -> {
                  ArticleDto articleDto = ArticleMapper.INSTANCE.toDto(article);

                  Optional<PriceDto> latestPrice =
                      articleDto.getPrices().stream()
                          .max(Comparator.comparing(PriceDto::getCreateDateTime));
                  latestPrice.ifPresent(priceDto -> articleDto.setLatestPrice(priceDto.getPrice()));
                  return articleDto;
                })
            .collect(Collectors.toList());

    Map<String, Object> model = new HashMap();
    model.put("articles", articles);
    return HttpResponse.ok(model);
  }
}

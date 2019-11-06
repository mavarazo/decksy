package com.decksy;

import com.decksy.domain.Article;
import com.decksy.domain.Price;
import com.decksy.domain.Product;
import com.decksy.repository.ArticleRepository;
import com.decksy.repository.PriceRepository;
import com.decksy.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.core.io.ResourceResolver;
import io.micronaut.core.io.scan.ClassPathResourceLoader;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;
import org.api.mkm.modele.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  private final ArticleRepository articleRepository;
  private final ProductRepository productRepository;
  private final PriceRepository priceRepository;

  Application(
      ArticleRepository articleRepository,
      ProductRepository productRepository,
      PriceRepository priceRepository) {
    this.articleRepository = articleRepository;
    this.productRepository = productRepository;
    this.priceRepository = priceRepository;
  }

  public static void main(String[] args) {
    Micronaut.run(Application.class);
  }

  @EventListener
  void init(StartupEvent event) throws URISyntaxException, IOException {
    ClassPathResourceLoader loader =
        new ResourceResolver().getLoader(ClassPathResourceLoader.class).get();
    Optional<URL> resource = loader.getResource("classpath:samples/2019-10-28_stock.json");
    if (!resource.isPresent()) {
      return;
    }

    ObjectMapper objectMapper = new ObjectMapper();

    Response response = objectMapper.readValue(resource.get(), Response.class);
    response.getArticle().stream()
        .forEach(
            article -> {


              Price price = new Price().setPrice(BigDecimal.valueOf(article.getPrice()));
              priceRepository.save(price);

              new Article()
                  .setAltered(article.isAltered())
                  .setArticleId(Long.valueOf(article.getIdArticle()))
                  .setComments(article.getComments())
                  .setCondition(article.getCondition())
                  .setCount(article.getCount())
                  .setFoil(article.isFoil())
                  .setLanguageId(Long.valueOf(article.getLanguage().getIdLanguage()))
                  .setPlayset(article.isPlayset())
                  .addPrice(price)
                  .setProduct(product)
                  .setSigned(article.isSigned());
            });
  }

  private Product save(org.api.mkm.modele.Product product) {
    Product product = new Product()
        .setExpansion(article.getProduct().getExpansionName())
        .setName(article.getProduct().getEnName())
        .setProductId(Long.valueOf(article.getIdProduct()))
        .setRarity(article.getProduct().getRarity());
    return productRepository.save(product);
  }
}

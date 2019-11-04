package com.decksy.controller;

import com.decksy.article.ArticleRepository;
import com.decksy.article.ArticleSaveCommand;
import com.decksy.domain.Article;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import java.net.URI;
import javax.validation.Valid;

@Validated
@Controller("/articles")
public class ArticleContoller {

  protected final ArticleRepository articleRepository;

  public ArticleContoller(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @Get("/{id}")
  public Article show(Long id) {
    return articleRepository.findById(id).orElse(null);
  }

  @Post("/")
  public HttpResponse<Article> save(@Body @Valid ArticleSaveCommand cmd) {
    Article article =
        articleRepository.save(
            cmd.getCount(),
            cmd.getLanguage_id(),
            cmd.getComments(),
            cmd.getFoil(),
            cmd.getSigned(),
            cmd.getAltered(),
            cmd.getPlayset());

    return HttpResponse.created(article)
        .headers(headers -> headers.location(location(article.getId())));
  }

  protected URI location(Long id) {
    return URI.create("/articles/" + id);
  }

  protected URI location(Article article) {
    return location(article.getId());
  }
}

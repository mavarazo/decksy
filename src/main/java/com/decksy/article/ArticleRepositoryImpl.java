package com.decksy.article;

import com.decksy.domain.Article;
import io.micronaut.validation.Validated;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.inject.Singleton;
import javax.validation.constraints.NotNull;

@Singleton
@Validated
public class ArticleRepositoryImpl implements ArticleRepository {

  private final ArticleMapper mapper;

  public ArticleRepositoryImpl(ArticleMapper mapper) {
    this.mapper = mapper;
  }

  @Override
  public Optional<Article> findById(@NotNull Long id) {
    return Optional.ofNullable(mapper.findById(id));
  }

  @Override
  public Article save(
      Integer count,
      Long language_id,
      String comments,
      Boolean isFoil,
      Boolean isSigned,
      Boolean isAltered,
      Boolean isPlayset) {
    Article article =
        new Article()
            .setLast_modified(LocalDateTime.now())
            .setCount(count)
            .setLanguage_id(language_id)
            .setComments(comments)
            .setFoil(isFoil)
            .setSigned(isSigned)
            .setAltered(isAltered)
            .setPlayset(isPlayset);
    mapper.save(article);
    return article;
  }

  @Override
  public void deleteById(@NotNull Long id) {
    findById(id).ifPresent(genre -> mapper.deleteById(id));
  }

  @Override
  public int update(
      Long id,
      Integer count,
      Long language_id,
      String comments,
      Boolean isFoil,
      Boolean isSigned,
      Boolean isAltered,
      Boolean isPlayset) {
    mapper.update(
        id,
        LocalDateTime.now(),
        count,
        language_id,
        comments,
        isFoil,
        isSigned,
        isAltered,
        isPlayset);
    return -1;
  }

  @Override
  public List<Article> findAll() {
    return mapper.findAll();
  }
}

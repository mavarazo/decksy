package com.decksy.article;

import com.decksy.domain.Article;
import java.util.List;
import java.util.Optional;
import javax.validation.constraints.NotNull;

public interface ArticleRepository {

  Optional<Article> findById(@NotNull Long id);

  Article save(
      Integer count,
      Long language_id,
      String comments,
      Boolean isFoil,
      Boolean isSigned,
      Boolean isAltered,
      Boolean isPlayset);

  void deleteById(@NotNull Long id);

  int update(
      Long id,
      Integer count,
      Long language_id,
      String comments,
      Boolean isFoil,
      Boolean isSigned,
      Boolean isAltered,
      Boolean isPlayset);

  List<Article> findAll();
}

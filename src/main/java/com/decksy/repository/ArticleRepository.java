package com.decksy.repository;

import com.decksy.domain.Article;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

  @Override
  @Join(value = "prices", type = Join.Type.FETCH)
  @Join(value = "product", type = Join.Type.FETCH)
  List<Article> findAll();
}

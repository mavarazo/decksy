package com.decksy.repository;

import com.decksy.domain.Article;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

  @Override
  List<Article> findAll();
}

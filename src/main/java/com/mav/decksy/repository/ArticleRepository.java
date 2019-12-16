package com.mav.decksy.repository;

import com.mav.decksy.model.Article;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

  @Override
  List<Article> findAll();
}

package com.decksy.service;

import java.util.List;

import com.decksy.api.mkm.stock.Article;
import com.decksy.controller.article.ArticleDto;

public interface ArticleService {

  List<ArticleDto> findAll();

  void save(List<Article> mkmArticles);
}

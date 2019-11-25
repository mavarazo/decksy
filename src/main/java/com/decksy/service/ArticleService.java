package com.decksy.service;

import com.decksy.api.mkm.stock.Article;
import java.util.List;

public interface ArticleService {

  void save(List<Article> mkmArticles);
}

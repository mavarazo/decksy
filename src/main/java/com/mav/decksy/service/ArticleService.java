package com.mav.decksy.service;

import com.mav.decksy.controller.article.ArticleDto;
import java.util.List;

public interface ArticleService {
  List<ArticleDto> findAll();
}

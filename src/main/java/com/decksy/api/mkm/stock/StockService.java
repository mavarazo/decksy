package com.decksy.api.mkm.stock;

import java.io.IOException;
import java.util.List;

import com.decksy.api.mkm.HttpException;

public interface StockService {
  List<Article> getStock() throws IOException, HttpException;
}

package com.decksy.api.mkm.stock;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;
import com.decksy.api.mkm.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Singleton
public class StockServiceImpl {

  private final MkmClient mkmClient;
  private final ObjectMapper objectMapper;

  public StockServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;

    this.objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
  }

  public List<Article> getStock() throws IOException, HttpException {
    List<Article> stock = new ArrayList<>();

    int paging = 1;
    boolean fetch = true;
    while (fetch) {
      InputStream response = mkmClient.get("/stock/" + paging);
      List<Article> articles = objectMapper.readValue(response, Response.class).getArticle();
      stock.addAll(articles);

      fetch = articles.size() == 100;
      paging += 100;
    }

    return stock;
  }
}

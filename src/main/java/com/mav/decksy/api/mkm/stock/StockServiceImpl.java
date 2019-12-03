package com.mav.decksy.api.mkm.stock;

import com.mav.decksy.api.mkm.HttpException;
import com.mav.decksy.api.mkm.MkmClient;
import com.mav.decksy.api.mkm.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

  private static final Logger LOGGER = LoggerFactory.getLogger(StockServiceImpl.class);

  private final MkmClient mkmClient;
  private final ObjectMapper objectMapper;

  public StockServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;

    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
  }

  @Override
  public List<Article> getStock() {
    List<Article> stock = new ArrayList<>();

    try {
      int paging = 1;
      boolean fetch = true;
      while (fetch) {
        InputStream response = mkmClient.get("/stock/" + paging);
        List<Article> articles = objectMapper.readValue(response, Response.class).getArticle();
        stock.addAll(articles);

        fetch = articles.size() == 100;
        paging += 100;
      }
    } catch (IOException | HttpException e) {
      LOGGER.error(e.getLocalizedMessage(), e);
    }

    return stock;
  }
}

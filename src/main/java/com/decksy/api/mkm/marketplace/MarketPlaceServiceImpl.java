package com.decksy.api.mkm.marketplace;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;
import com.decksy.api.mkm.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Singleton
public class MarketPlaceServiceImpl implements MarketPlaceService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MarketPlaceServiceImpl.class);

  private final MkmClient mkmClient;
  private final ObjectMapper objectMapper;

  public MarketPlaceServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;

    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
  }

  @Override
  public Optional<Product> getProduct(Long idProduct) {
    try {
      InputStream response = mkmClient.get("/products/" + idProduct.toString());
      ObjectMapper objectMapper = new ObjectMapper();
      objectMapper.registerModule(new JavaTimeModule());
      return Optional.ofNullable(objectMapper.readValue(response, Response.class).getProduct());
    } catch (IOException | HttpException e) {
      LOGGER.error(e.getLocalizedMessage(), e);
    }
    return Optional.empty();
  }
}

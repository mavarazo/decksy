package com.mav.decksy.api.mkm.account;

import com.mav.decksy.api.mkm.HttpException;
import com.mav.decksy.api.mkm.MkmClient;
import com.mav.decksy.api.mkm.Response;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

  private final MkmClient mkmClient;

  public AccountServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;
  }

  @Override
  public Account getAccount() {
    try {
      InputStream response = mkmClient.get("/account");
      ObjectMapper objectMapper = new ObjectMapper();
      objectMapper.registerModule(new JavaTimeModule());
      return objectMapper.readValue(response, Response.class).getAccount();
    } catch (IOException | HttpException e) {
      LOGGER.error(e.getLocalizedMessage(), e);
    }
    return null;
  }
}

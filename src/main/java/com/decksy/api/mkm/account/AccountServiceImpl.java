package com.decksy.api.mkm.account;

import java.io.IOException;
import java.io.InputStream;

import javax.inject.Singleton;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;
import com.decksy.api.mkm.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Singleton
public class AccountServiceImpl implements AccountService {

  private final MkmClient mkmClient;

  public AccountServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;
  }

  @Override
  public Account getAccount() throws IOException, HttpException {
    InputStream response = mkmClient.get("/account");
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    return objectMapper.readValue(response, Response.class).getAccount();
  }
}

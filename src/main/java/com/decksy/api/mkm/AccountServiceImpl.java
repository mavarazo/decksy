package com.decksy.api.mkm;

import java.io.IOException;
import javax.inject.Singleton;

@Singleton
public class AccountServiceImpl {

  private final MkmClient mkmClient;

  public AccountServiceImpl(MkmClient mkmClient) {
    this.mkmClient = mkmClient;
  }

  public String get_account() throws IOException, HttpException {
    return mkmClient.get("/account");
  }
}

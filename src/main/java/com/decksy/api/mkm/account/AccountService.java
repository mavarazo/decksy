package com.decksy.api.mkm.account;

import java.io.IOException;

import com.decksy.api.mkm.HttpException;

public interface AccountService {
  Account getAccount() throws IOException, HttpException;
}

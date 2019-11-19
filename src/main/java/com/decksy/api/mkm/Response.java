package com.decksy.api.mkm;

import com.decksy.api.mkm.account.Account;
import java.util.ArrayList;
import java.util.List;

public class Response {
  private List<Link> links = new ArrayList<>();
  private Account account;

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}

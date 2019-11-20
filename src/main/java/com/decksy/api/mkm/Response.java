package com.decksy.api.mkm;

import com.decksy.api.mkm.account.Account;
import com.decksy.api.mkm.stock.Article;

import java.util.ArrayList;
import java.util.List;

public class Response {
  private List<Link> links = new ArrayList<>();
  private Account account;
  private List<Article> article = new ArrayList<>();

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public List<Article> getArticle() {
    return article;
  }

  public Response setArticle(List<Article> article) {
    this.article = article;
    return this;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}

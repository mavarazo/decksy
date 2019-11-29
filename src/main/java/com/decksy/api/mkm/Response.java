package com.decksy.api.mkm;

import java.util.ArrayList;
import java.util.List;

import com.decksy.api.mkm.account.Account;
import com.decksy.api.mkm.marketplace.Product;
import com.decksy.api.mkm.stock.Article;

public class Response {
  private List<Link> links = new ArrayList<>();
  private Account account;
  private List<Article> article = new ArrayList<>();
  private Product product;

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

  public Product getProduct() {
    return product;
  }

  public Response setProduct(Product product) {
    this.product = product;
    return this;
  }

  @Override
  public String toString() {
    return "Response{"
        + "links="
        + links
        + ", account="
        + account
        + ", article="
        + article
        + ", product="
        + product
        + '}';
  }
}

package com.decksy.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Price {

  private Long id;
  private LocalDateTime last_modified;
  private Long article_id;
  private BigDecimal price;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getLast_modified() {
    return last_modified;
  }

  public void setLast_modified(LocalDateTime last_modified) {
    this.last_modified = last_modified;
  }

  public Long getArticle_id() {
    return article_id;
  }

  public void setArticle_id(Long article_id) {
    this.article_id = article_id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Price{"
        + "id="
        + id
        + ", last_modified="
        + last_modified
        + ", article_id="
        + article_id
        + ", price="
        + price
        + '}';
  }
}

package com.decksy.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Article {

  private Long id;
  private LocalDateTime last_modified;

  @JsonAlias(value = "idProduct")
  private Long product_id;

  @JsonAlias(value = "idArticle")
  private Long article_id;

  private Integer count;

  @JsonAlias(value = "languageId")
  private Long language_id;

  private String comments;
  private String condition;
  private Boolean isFoil;
  private Boolean isSigned;
  private Boolean isAltered;
  private Boolean isPlayset;

  @JsonIgnore private Product product;
  @JsonIgnore private Set<Price> prices = new HashSet<>();

  public Long getId() {
    return id;
  }

  public Article setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getLast_modified() {
    return last_modified;
  }

  public Article setLast_modified(LocalDateTime last_modified) {
    this.last_modified = last_modified;
    return this;
  }

  public Long getProduct_id() {
    return product_id;
  }

  public Article setProduct_id(Long product_id) {
    this.product_id = product_id;
    return this;
  }

  public Long getArticle_id() {
    return article_id;
  }

  public Article setArticle_id(Long article_id) {
    this.article_id = article_id;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public Article setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Long getLanguage_id() {
    return language_id;
  }

  public Article setLanguage_id(Long language_id) {
    this.language_id = language_id;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public Article setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public String getCondition() {
    return condition;
  }

  public Article setCondition(String condition) {
    this.condition = condition;
    return this;
  }

  public Boolean getFoil() {
    return isFoil;
  }

  public Article setFoil(Boolean foil) {
    isFoil = foil;
    return this;
  }

  public Boolean getSigned() {
    return isSigned;
  }

  public Article setSigned(Boolean signed) {
    isSigned = signed;
    return this;
  }

  public Boolean getAltered() {
    return isAltered;
  }

  public Article setAltered(Boolean altered) {
    isAltered = altered;
    return this;
  }

  public Boolean getPlayset() {
    return isPlayset;
  }

  public Article setPlayset(Boolean playset) {
    isPlayset = playset;
    return this;
  }

  public Product getProduct() {
    return product;
  }

  public Article setProduct(Product product) {
    this.product = product;
    return this;
  }

  public Set<Price> getPrices() {
    return prices;
  }

  public Article setPrices(Set<Price> prices) {
    this.prices = prices;
    return this;
  }

  @Override
  public String toString() {
    return "Article{"
        + "id="
        + id
        + ", last_modified="
        + last_modified
        + ", product_id="
        + product_id
        + ", article_id="
        + article_id
        + ", count="
        + count
        + ", language_id="
        + language_id
        + ", comments='"
        + comments
        + '\''
        + ", condition='"
        + condition
        + '\''
        + ", isFoil="
        + isFoil
        + ", isSigned="
        + isSigned
        + ", isAltered="
        + isAltered
        + ", isPlayset="
        + isPlayset
        + ", product="
        + product
        + ", prices="
        + prices
        + '}';
  }
}

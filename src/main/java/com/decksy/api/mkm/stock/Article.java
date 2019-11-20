package com.decksy.api.mkm.stock;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Article {
  private Long idArticle;
  private Long idProduct;
  private Language language;
  private String comments;
  private Double price;
  private Integer count;
  private Boolean inShoppingCart;
  private Product product;

  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ssX",
      with = JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
  private LocalDateTime lastEdited;

  private String condition;
  private Boolean isFoil;
  private Boolean isSigned;
  private Boolean isPlayset;
  private Boolean isAltered;

  public Long getIdArticle() {
    return idArticle;
  }

  public Article setIdArticle(Long idArticle) {
    this.idArticle = idArticle;
    return this;
  }

  public Long getIdProduct() {
    return idProduct;
  }

  public Article setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  public Article setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public Article setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public Double getPrice() {
    return price;
  }

  public Article setPrice(Double price) {
    this.price = price;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public Article setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Boolean getInShoppingCart() {
    return inShoppingCart;
  }

  public Article setInShoppingCart(Boolean inShoppingCart) {
    this.inShoppingCart = inShoppingCart;
    return this;
  }

  public Product getProduct() {
    return product;
  }

  public Article setProduct(Product product) {
    this.product = product;
    return this;
  }

  public LocalDateTime getLastEdited() {
    return lastEdited;
  }

  public Article setLastEdited(LocalDateTime lastEdited) {
    this.lastEdited = lastEdited;
    return this;
  }

  public String getCondition() {
    return condition;
  }

  public Article setCondition(String condition) {
    this.condition = condition;
    return this;
  }

  public Boolean getIsFoil() {
    return isFoil;
  }

  public Article setIsFoil(Boolean foil) {
    isFoil = foil;
    return this;
  }

  public Boolean getIsSigned() {
    return isSigned;
  }

  public Article setIsSigned(Boolean signed) {
    isSigned = signed;
    return this;
  }

  public Boolean getIsPlayset() {
    return isPlayset;
  }

  public Article setIsPlayset(Boolean playset) {
    isPlayset = playset;
    return this;
  }

  public Boolean getIsAltered() {
    return isAltered;
  }

  public Article setIsAltered(Boolean altered) {
    isAltered = altered;
    return this;
  }

  @Override
  public String toString() {
    return "Article{"
        + "idArticle="
        + idArticle
        + ", idProduct="
        + idProduct
        + ", language="
        + language
        + ", comments='"
        + comments
        + '\''
        + ", price="
        + price
        + ", count="
        + count
        + ", inShoppingCart="
        + inShoppingCart
        + ", product="
        + product
        + ", lastEdited="
        + lastEdited
        + ", condition='"
        + condition
        + '\''
        + ", isFoil="
        + isFoil
        + ", isSigned="
        + isSigned
        + ", isPlayset="
        + isPlayset
        + ", isAltered="
        + isAltered
        + '}';
  }
}

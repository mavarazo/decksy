package com.decksy.article;

public class ArticleSaveCommand {

  private Long product_id;
  private Long article_id;
  private Integer count;
  private Long language_id;
  private String comments;
  private String condition;
  private Boolean isFoil;
  private Boolean isSigned;
  private Boolean isAltered;
  private Boolean isPlayset;

  public Long getProduct_id() {
    return product_id;
  }

  public ArticleSaveCommand setProduct_id(Long product_id) {
    this.product_id = product_id;
    return this;
  }

  public Long getArticle_id() {
    return article_id;
  }

  public ArticleSaveCommand setArticle_id(Long article_id) {
    this.article_id = article_id;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public ArticleSaveCommand setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Long getLanguage_id() {
    return language_id;
  }

  public ArticleSaveCommand setLanguage_id(Long language_id) {
    this.language_id = language_id;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public ArticleSaveCommand setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public String getCondition() {
    return condition;
  }

  public ArticleSaveCommand setCondition(String condition) {
    this.condition = condition;
    return this;
  }

  public Boolean getFoil() {
    return isFoil;
  }

  public ArticleSaveCommand setFoil(Boolean foil) {
    isFoil = foil;
    return this;
  }

  public Boolean getSigned() {
    return isSigned;
  }

  public ArticleSaveCommand setSigned(Boolean signed) {
    isSigned = signed;
    return this;
  }

  public Boolean getAltered() {
    return isAltered;
  }

  public ArticleSaveCommand setAltered(Boolean altered) {
    isAltered = altered;
    return this;
  }

  public Boolean getPlayset() {
    return isPlayset;
  }

  public ArticleSaveCommand setPlayset(Boolean playset) {
    isPlayset = playset;
    return this;
  }
}

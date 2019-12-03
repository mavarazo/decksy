package com.mav.decksy.controller.article;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ArticleDto {

  private Long id;
  private LocalDateTime createDateTime;
  private LocalDateTime updateDateTime;

  private Long articleId;
  private Integer count;
  private Long languageId;
  private String comments;
  private String condition;
  private Boolean isFoil;
  private Boolean isSigned;
  private Boolean isAltered;
  private Boolean isPlayset;
  private ProductDto product;
  private Double latestPrice;
  private Set<PriceDto> prices = new HashSet<>();
  private PriceGuideDto priceGuide;

  public Long getId() {
    return id;
  }

  public ArticleDto setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public ArticleDto setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public ArticleDto setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Long getArticleId() {
    return articleId;
  }

  public ArticleDto setArticleId(Long articleId) {
    this.articleId = articleId;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public ArticleDto setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Long getLanguageId() {
    return languageId;
  }

  public ArticleDto setLanguageId(Long languageId) {
    this.languageId = languageId;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public ArticleDto setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public String getCondition() {
    return condition;
  }

  public ArticleDto setCondition(String condition) {
    this.condition = condition;
    return this;
  }

  public Boolean getFoil() {
    return isFoil;
  }

  public ArticleDto setFoil(Boolean foil) {
    isFoil = foil;
    return this;
  }

  public Boolean getSigned() {
    return isSigned;
  }

  public ArticleDto setSigned(Boolean signed) {
    isSigned = signed;
    return this;
  }

  public Boolean getAltered() {
    return isAltered;
  }

  public ArticleDto setAltered(Boolean altered) {
    isAltered = altered;
    return this;
  }

  public Boolean getPlayset() {
    return isPlayset;
  }

  public ArticleDto setPlayset(Boolean playset) {
    isPlayset = playset;
    return this;
  }

  public ProductDto getProduct() {
    return product;
  }

  public ArticleDto setProduct(ProductDto product) {
    this.product = product;
    return this;
  }

  public Double getLatestPrice() {
    return latestPrice;
  }

  public ArticleDto setLatestPrice(Double latestPrice) {
    this.latestPrice = latestPrice;
    return this;
  }

  public Set<PriceDto> getPrices() {
    return prices;
  }

  public ArticleDto setPrices(Set<PriceDto> prices) {
    this.prices = prices;
    return this;
  }

  public PriceGuideDto getPriceGuide() {
    return priceGuide;
  }

  public ArticleDto setPriceGuide(PriceGuideDto priceGuide) {
    this.priceGuide = priceGuide;
    return this;
  }
}

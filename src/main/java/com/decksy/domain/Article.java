package com.decksy.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "articles")
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreationTimestamp private LocalDateTime createDateTime;

  @UpdateTimestamp private LocalDateTime updateDateTime;

  @JsonAlias(value = "idArticle")
  private Long articleId;

  private Integer count;

  @JsonAlias(value = "languageId")
  private Long languageId;

  private String comments;
  private String condition;
  private Boolean isFoil;
  private Boolean isSigned;
  private Boolean isAltered;
  private Boolean isPlayset;

  @JsonIgnore @ManyToOne private Product product;

  @JsonIgnore
  @OneToMany(mappedBy = "article")
  private Set<Price> prices = new HashSet<>();

  public Long getId() {
    return id;
  }

  public Article setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public Article setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public Article setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Long getArticleId() {
    return articleId;
  }

  public Article setArticleId(Long articleId) {
    this.articleId = articleId;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public Article setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Long getLanguageId() {
    return languageId;
  }

  public Article setLanguageId(Long languageId) {
    this.languageId = languageId;
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

  public Article addPrice(Price price) {
    this.prices.add(price);
    return this;
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
        + ", createDateTime="
        + createDateTime
        + ", updateDateTime="
        + updateDateTime
        + ", articleId="
        + articleId
        + ", count="
        + count
        + ", languageId="
        + languageId
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

package com.decksy.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreationTimestamp private LocalDateTime createDateTime;

  @UpdateTimestamp private LocalDateTime updateDateTime;

  @OneToOne private Article article;

  @JsonAlias(value = "idProduct")
  private Long productId;

  @JsonAlias(value = "name_en")
  private String name;

  private String expansion;
  private String rarity;

  public Long getId() {
    return id;
  }

  public Product setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public Product setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public Product setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Article getArticle() {
    return article;
  }

  public Product setArticle(Article article) {
    this.article = article;
    return this;
  }

  public Long getProductId() {
    return productId;
  }

  public Product setProductId(Long productId) {
    this.productId = productId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Product setName(String name) {
    this.name = name;
    return this;
  }

  public String getExpansion() {
    return expansion;
  }

  public Product setExpansion(String expansion) {
    this.expansion = expansion;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public Product setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }
}

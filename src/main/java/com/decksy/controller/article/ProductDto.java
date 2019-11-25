package com.decksy.controller.article;

import java.time.LocalDateTime;

public class ProductDto {
  private Long id;
  private LocalDateTime createDateTime;
  private LocalDateTime updateDateTime;
  private Long productId;
  private String name;
  private String expansion;
  private String rarity;

  public Long getId() {
    return id;
  }

  public ProductDto setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public ProductDto setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public ProductDto setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Long getProductId() {
    return productId;
  }

  public ProductDto setProductId(Long productId) {
    this.productId = productId;
    return this;
  }

  public String getName() {
    return name;
  }

  public ProductDto setName(String name) {
    this.name = name;
    return this;
  }

  public String getExpansion() {
    return expansion;
  }

  public ProductDto setExpansion(String expansion) {
    this.expansion = expansion;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public ProductDto setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }
}

package com.decksy.controller.article;

import java.time.LocalDateTime;

public class PriceDto {
  private Long id;
  private LocalDateTime createDateTime;
  private LocalDateTime updateDateTime;
  private Double price;

  public Long getId() {
    return id;
  }

  public PriceDto setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public PriceDto setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public PriceDto setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Double getPrice() {
    return price;
  }

  public PriceDto setPrice(Double price) {
    this.price = price;
    return this;
  }
}

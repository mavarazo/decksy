package com.decksy.domain;

import java.time.LocalDateTime;

public class Product {

  private Long id;
  private LocalDateTime last_modified;
  private Long product_id;
  private String name;
  private Integer icon;
  private String expansion;
  private String rarity;

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

  public Long getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Long product_id) {
    this.product_id = product_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getIcon() {
    return icon;
  }

  public void setIcon(Integer icon) {
    this.icon = icon;
  }

  public String getExpansion() {
    return expansion;
  }

  public void setExpansion(String expansion) {
    this.expansion = expansion;
  }

  public String getRarity() {
    return rarity;
  }

  public void setRarity(String rarity) {
    this.rarity = rarity;
  }

  @Override
  public String toString() {
    return "Product{"
        + "id="
        + id
        + ", last_modified="
        + last_modified
        + ", product_id="
        + product_id
        + ", name='"
        + name
        + '\''
        + ", icon="
        + icon
        + ", expansion='"
        + expansion
        + '\''
        + ", rarity='"
        + rarity
        + '\''
        + '}';
  }
}

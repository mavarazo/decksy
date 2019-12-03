package com.mav.decksy.api.mkm.marketplace;

public class Reprint {
  private Long idProduct;
  private String expansion;
  private String expIcon;

  public Long getIdProduct() {
    return idProduct;
  }

  public Reprint setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  public String getExpansion() {
    return expansion;
  }

  public Reprint setExpansion(String expansion) {
    this.expansion = expansion;
    return this;
  }

  public String getExpIcon() {
    return expIcon;
  }

  public Reprint setExpIcon(String expIcon) {
    this.expIcon = expIcon;
    return this;
  }
}

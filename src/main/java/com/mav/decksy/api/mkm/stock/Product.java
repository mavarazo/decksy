package com.mav.decksy.api.mkm.stock;

public class Product {
  private Long idGame;
  private String enName;
  private String locName;
  private String image;
  private String expansion;
  private String nr;
  private String expIcon;
  private String rarity;

  public Long getIdGame() {
    return idGame;
  }

  public Product setIdGame(Long idGame) {
    this.idGame = idGame;
    return this;
  }

  public String getEnName() {
    return enName;
  }

  public Product setEnName(String enName) {
    this.enName = enName;
    return this;
  }

  public String getLocName() {
    return locName;
  }

  public Product setLocName(String locName) {
    this.locName = locName;
    return this;
  }

  public String getImage() {
    return image;
  }

  public Product setImage(String image) {
    this.image = image;
    return this;
  }

  public String getExpansion() {
    return expansion;
  }

  public Product setExpansion(String expansion) {
    this.expansion = expansion;
    return this;
  }

  public String getNr() {
    return nr;
  }

  public Product setNr(String nr) {
    this.nr = nr;
    return this;
  }

  public String getExpIcon() {
    return expIcon;
  }

  public Product setExpIcon(String expIcon) {
    this.expIcon = expIcon;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public Product setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }

  @Override
  public String toString() {
    return "Product{"
        + "idGame="
        + idGame
        + ", enName='"
        + enName
        + '\''
        + ", locName='"
        + locName
        + '\''
        + ", image='"
        + image
        + '\''
        + ", expansion='"
        + expansion
        + '\''
        + ", nr='"
        + nr
        + '\''
        + ", expIcon='"
        + expIcon
        + '\''
        + ", rarity='"
        + rarity
        + '\''
        + '}';
  }
}

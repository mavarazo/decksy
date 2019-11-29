package com.decksy.api.mkm.marketplace;

import java.util.ArrayList;
import java.util.List;

import com.decksy.api.mkm.Link;

public class Product {
  private List<Link> links = new ArrayList<>();

  private Long idProduct;
  private Long idMetaproduct;
  private Integer countReprints;
  private String enName;
  private String locName;
  private List<Localization> localization;
  private String website;
  private String image;
  private String gameName;
  private String categoryName;
  private Long idGame;
  private String number;
  private String rarity;
  private Expansion expansion;
  private PriceGuide priceGuide;
  private Integer countArticles;
  private Integer countFoils;
  private List<Reprint> reprint;

  public List<Link> getLinks() {
    return links;
  }

  public Product setLinks(List<Link> links) {
    this.links = links;
    return this;
  }

  public Long getIdProduct() {
    return idProduct;
  }

  public Product setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  public Long getIdMetaproduct() {
    return idMetaproduct;
  }

  public Product setIdMetaproduct(Long idMetaproduct) {
    this.idMetaproduct = idMetaproduct;
    return this;
  }

  public Integer getCountReprints() {
    return countReprints;
  }

  public Product setCountReprints(Integer countReprints) {
    this.countReprints = countReprints;
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

  public List<Localization> getLocalization() {
    return localization;
  }

  public Product setLocalization(List<Localization> localization) {
    this.localization = localization;
    return this;
  }

  public String getWebsite() {
    return website;
  }

  public Product setWebsite(String website) {
    this.website = website;
    return this;
  }

  public String getImage() {
    return image;
  }

  public Product setImage(String image) {
    this.image = image;
    return this;
  }

  public String getGameName() {
    return gameName;
  }

  public Product setGameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public Product setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  public Long getIdGame() {
    return idGame;
  }

  public Product setIdGame(Long idGame) {
    this.idGame = idGame;
    return this;
  }

  public String getNumber() {
    return number;
  }

  public Product setNumber(String number) {
    this.number = number;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public Product setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }

  public Expansion getExpansion() {
    return expansion;
  }

  public Product setExpansion(Expansion expansion) {
    this.expansion = expansion;
    return this;
  }

  public PriceGuide getPriceGuide() {
    return priceGuide;
  }

  public Product setPriceGuide(PriceGuide priceGuide) {
    this.priceGuide = priceGuide;
    return this;
  }

  public Integer getCountArticles() {
    return countArticles;
  }

  public Product setCountArticles(Integer countArticles) {
    this.countArticles = countArticles;
    return this;
  }

  public Integer getCountFoils() {
    return countFoils;
  }

  public Product setCountFoils(Integer countFoils) {
    this.countFoils = countFoils;
    return this;
  }

  public List<Reprint> getReprint() {
    return reprint;
  }

  public Product setReprint(List<Reprint> reprint) {
    this.reprint = reprint;
    return this;
  }
}

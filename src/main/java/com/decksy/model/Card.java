package com.decksy.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cards")
public class Card {

  @Id @GeneratedValue private long id;
  @CreatedDate private LocalDate created;
  @LastModifiedDate private LocalDate updated;

  @OneToMany(mappedBy = "cards")
  private Set<DeckCard> deckCards;

  @NotBlank private int multiverseId;

  private String name;
  private String layout;
  private double cmc;
  private List<Color> colors;
  private String manaCost;
  private String type;
  private List<Type> supertypes;
  private List<Type> types;
  private List<Type> subtypes;
  private String rarity;
  private String power;
  private String toughness;
  private String imageUrl;

  public long getId() {
    return id;
  }

  public LocalDate getCreated() {
    return created;
  }

  public Card setCreated(LocalDate created) {
    this.created = created;
    return this;
  }

  public LocalDate getUpdated() {
    return updated;
  }

  public Card setUpdated(LocalDate updated) {
    this.updated = updated;
    return this;
  }

  public Set<DeckCard> getDeckCards() {
    return deckCards;
  }

  public Card setDeckCards(Set<DeckCard> deckCards) {
    this.deckCards = deckCards;
    return this;
  }

  public int getMultiverseId() {
    return multiverseId;
  }

  public Card setMultiverseId(int multiverseId) {
    this.multiverseId = multiverseId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Card setName(String name) {
    this.name = name;
    return this;
  }

  public String getLayout() {
    return layout;
  }

  public Card setLayout(String layout) {
    this.layout = layout;
    return this;
  }

  public double getCmc() {
    return cmc;
  }

  public Card setCmc(double cmc) {
    this.cmc = cmc;
    return this;
  }

  public List<Color> getColors() {
    return colors;
  }

  public Card setColors(List<Color> colors) {
    this.colors = colors;
    return this;
  }

  public String getManaCost() {
    return manaCost;
  }

  public Card setManaCost(String manaCost) {
    this.manaCost = manaCost;
    return this;
  }

  public String getType() {
    return type;
  }

  public Card setType(String type) {
    this.type = type;
    return this;
  }

  public List<Type> getSupertypes() {
    return supertypes;
  }

  public Card setSupertypes(List<Type> supertypes) {
    this.supertypes = supertypes;
    return this;
  }

  public List<Type> getTypes() {
    return types;
  }

  public Card setTypes(List<Type> types) {
    this.types = types;
    return this;
  }

  public List<Type> getSubtypes() {
    return subtypes;
  }

  public Card setSubtypes(List<Type> subtypes) {
    this.subtypes = subtypes;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public Card setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }

  public String getPower() {
    return power;
  }

  public Card setPower(String power) {
    this.power = power;
    return this;
  }

  public String getToughness() {
    return toughness;
  }

  public Card setToughness(String toughness) {
    this.toughness = toughness;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public Card setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
}

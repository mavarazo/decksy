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
import java.util.Set;

@Entity
@Table(name = "decks")
public class Deck {

  @Id @GeneratedValue private long id;
  @CreatedDate private LocalDate created;
  @LastModifiedDate private LocalDate updated;

  @NotBlank(message = "Name is mandatory")
  private String name;
  private String notes;

  @OneToMany(mappedBy = "decks")
  private Set<DeckCard> deckCards;

  public long getId() {
    return id;
  }

  public LocalDate getCreated() {
    return created;
  }

  public Deck setCreated(LocalDate created) {
    this.created = created;
    return this;
  }

  public LocalDate getUpdated() {
    return updated;
  }

  public Deck setUpdated(LocalDate updated) {
    this.updated = updated;
    return this;
  }

  public String getName() {
    return name;
  }

  public Deck setName(String name) {
    this.name = name;
    return this;
  }

  public String getNotes() {
    return notes;
  }

  public Deck setNotes(String notes) {
    this.notes = notes;
    return this;
  }

  public Set<DeckCard> getDeckCards() {
    return deckCards;
  }

  public Deck setDeckCards(Set<DeckCard> deckCards) {
    this.deckCards = deckCards;
    return this;
  }

}

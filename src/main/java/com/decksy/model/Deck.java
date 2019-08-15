package com.decksy.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "decks")
public class Deck {

  @Id @GeneratedValue private long id;
  @CreationTimestamp private LocalDate created;
  @UpdateTimestamp private LocalDate updated;

  @NotBlank(message = "Name is mandatory")
  private String name;
  private String notes;

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
  
  public List<Card> getDecklist(String DeckID) {
	  List<Card> deckList = DeckList.getDeckList();
	  return deckList;
  }

}

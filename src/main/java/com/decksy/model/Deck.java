package com.decksy.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "decks")
public class Deck {

  @Id @GeneratedValue private long id;
  @CreationTimestamp private LocalDate created;
  @UpdateTimestamp private LocalDate updated;

  private String name;
  private String notes;
}

package com.decksy.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "deck_card")
public class DeckCard {

   @Id @GeneratedValue private long id;
   @CreatedDate private LocalDate created;
   @LastModifiedDate private LocalDate updated;
   private LocalDate replaced;

   @ManyToOne
   @JoinColumn(name = "deck_id")
   Deck deck;

   @ManyToOne
   @JoinColumn(name = "card_id")
   Card card;

   int amount;

}

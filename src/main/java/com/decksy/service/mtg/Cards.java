package com.decksy.service.mtg;

import java.util.List;

class Cards {
   private List<Card> cards;

   public List<Card> getCards() {
      return cards;
   }

   public Cards setCards(List<Card> cards) {
      this.cards = cards;
      return this;
   }
}

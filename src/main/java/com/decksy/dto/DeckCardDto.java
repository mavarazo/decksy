package com.decksy.dto;

public class DeckCardDto {

  private long deckId;
  private long cardId;
  private String mtgId;

  public long getDeckId() {
    return deckId;
  }

  public DeckCardDto setDeckId(long deckId) {
    this.deckId = deckId;
    return this;
  }

  public long getCardId() {
    return cardId;
  }

  public DeckCardDto setCardId(long cardId) {
    this.cardId = cardId;
    return this;
  }

  public String getMtgId() {
    return mtgId;
  }

  public DeckCardDto setMtgId(String mtgId) {
    this.mtgId = mtgId;
    return this;
  }
}

package com.decksy.service;

import com.decksy.model.Card;

import java.util.List;

public interface CardService {

   List<Card> fetchCardByName(String name);
}

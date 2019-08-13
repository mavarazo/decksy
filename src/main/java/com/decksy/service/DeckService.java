package com.decksy.service;

import com.decksy.model.Deck;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface DeckService {

  List<Deck> findAll();

  Optional<Deck> findById(Long id);

  Deck save(Deck deck);
}

package com.decksy.service;

import com.decksy.model.Deck;
import com.decksy.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeckServiceImpl implements DeckService {

  @Autowired private DeckRepository deckRepository;

  @Override
  public List<Deck> findAll() {
    return deckRepository.findAll();
  }

  @Override
  public Optional<Deck> findById(Long id) {
     return deckRepository.findById(id);
  }

  @Override
  public Deck save(Deck deck) {
    return deckRepository.save(deck);
  }
}

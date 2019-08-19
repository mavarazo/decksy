package com.decksy.repository;

import com.decksy.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

  Card findByMultiverseId(int multiversId);
}

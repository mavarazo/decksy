package com.mav.decksy.repository;

import com.mav.decksy.model.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
}

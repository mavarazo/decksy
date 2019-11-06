package com.decksy.repository;

import com.decksy.domain.Price;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {

  @Override
  List<Price> findAll();
}

package com.decksy.repository;

import com.decksy.domain.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

  @Override
  List<Product> findAll();
}

package com.mav.decksy.api.mkm.marketplace;

import java.util.Optional;

public interface MarketPlaceService {
  Optional<Product> getProduct(Long idProduct);
}

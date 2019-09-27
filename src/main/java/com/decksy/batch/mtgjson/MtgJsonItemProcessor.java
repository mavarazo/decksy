package com.decksy.batch.mtgjson;

import com.decksy.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MtgJsonItemProcessor implements ItemProcessor<Map<String, MtgJsonSet>, Card> {
  private static final Logger LOGGER = LoggerFactory.getLogger(MtgJsonItemProcessor.class);

  @Override
  public Card process(Map<String, MtgJsonSet> item) throws Exception {
    List<Card> result = new ArrayList<>();
    item.entrySet().stream()
        .forEach(
            entry -> {
              entry.getValue().getCards().stream()
                  .forEach(
                      card -> {
                        result.add(new Card());
                      });
            });
    return result.get(0);
  }
}

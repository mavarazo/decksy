package com.decksy.batch.mtgjson;

import com.decksy.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class MtgJsonItemWriter implements ItemWriter<Card> {
  private static final Logger LOGGER = LoggerFactory.getLogger(MtgJsonItemWriter.class);

  @Override
  public void write(List<? extends Card> items) throws Exception {
    items.stream().forEach(c -> LOGGER.info(((Card) c).toString()));
  }
}

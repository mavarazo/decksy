package com.decksy.service;

import com.decksy.mapper.CardMapper;
import com.decksy.model.Card;
import com.decksy.service.mtg.CardApiImpl;
import io.magicthegathering.javasdk.api.CardAPI;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

   public List<Card> fetchCardByName(String name) {
      List<com.decksy.service.mtg.Card> result = new CardApiImpl().fetchCardsByFilters();
      return result.stream().map(c -> CardMapper.INSTANCE.toModel(c)).collect(Collectors.toList());
   }

}

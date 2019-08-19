package com.decksy.service;

import com.decksy.dto.DeckCardDto;
import com.decksy.mapper.CardMapper;
import com.decksy.model.Card;
import com.decksy.repository.CardRepository;
import io.magicthegathering.javasdk.api.CardAPI;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

  @Autowired private CardRepository cardRepository;

  public List<Card> fetchCardByName(String name) {
    CardApi.overrideHttpClient();
    List<io.magicthegathering.javasdk.resource.Card> result =
        CardApi.getAllCards(Arrays.asList("name=" + name));
    return result.stream().map(c -> CardMapper.INSTANCE.toModel(c)).collect(Collectors.toList());
  }

  private Card fetchCardById(String mtgId) {
    CardApi.overrideHttpClient();
    io.magicthegathering.javasdk.resource.Card result = CardApi.getCard(mtgId);
    return CardMapper.INSTANCE.toModel(result);
  }

  @Override
  public Card findByMtgId(String mtgId) {
    return cardRepository.findByMtgId(mtgId);
  }

  public Card save(DeckCardDto deckCardDto) {
    if (deckCardDto.getCardId() == 0) {
      Card card = cardRepository.save(fetchCardById(deckCardDto.getMtgId()));
    }

    deck
  }

  static class CardApi extends CardAPI {
    public static void overrideHttpClient() {
      CardAPI.CLIENT =
          new OkHttpClient()
              .newBuilder()
              .connectTimeout(60, TimeUnit.SECONDS)
              .readTimeout(60, TimeUnit.SECONDS)
              .build();
    }
  }
}

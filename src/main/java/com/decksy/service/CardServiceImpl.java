package com.decksy.service;

import com.decksy.mapper.CardMapper;
import com.decksy.model.Card;
import io.magicthegathering.javasdk.api.CardAPI;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

   public List<Card> fetchCardByName(String name) {
      CardApi.overrideHttpClient();
      List<io.magicthegathering.javasdk.resource.Card> result = CardApi.getAllCards(Arrays.asList("name=" + name));
      return result.stream().map(c -> CardMapper.INSTANCE.toModel(c)).collect(Collectors.toList());
   }

   static class CardApi extends CardAPI {
      public static void overrideHttpClient() {
         CardAPI.CLIENT = new OkHttpClient().newBuilder()
               .connectTimeout(60, TimeUnit.SECONDS)
               .readTimeout(60, TimeUnit.SECONDS)
               .build();
      }
   }

}

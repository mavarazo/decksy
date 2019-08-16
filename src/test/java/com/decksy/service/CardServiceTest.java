package com.decksy.service;

import com.decksy.model.Card;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class CardServiceTest {

   @Test
   public void fetchCardByName_Archangel_Avacyn() {
      // Arrange

      // Act
      List<Card> result = new CardServiceImpl().fetchCardByName("Archangel Avacyn");

      // Assert
      assertThat(result, hasSize(3));
   }

}

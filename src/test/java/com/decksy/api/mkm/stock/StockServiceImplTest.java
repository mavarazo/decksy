package com.decksy.api.mkm.stock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;

import io.micronaut.core.io.ResourceResolver;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class StockServiceImplTest {

  @Test
  void getStock() throws IOException, HttpException {
    // Arrange
    MkmClient mkmClient = mock(MkmClient.class);
    StockServiceImpl sut = spy(new StockServiceImpl(mkmClient));

    doAnswer(
            new Answer() {
              @Override
              public Object answer(InvocationOnMock invocation) throws Throwable {
                String argument = invocation.getArgument(0, String.class);
                if ("/stock/1".equals(argument)) {
                  return new ResourceResolver()
                      .getResourceAsStream("classpath:2019-11-20_stock_1_100.json")
                      .get();
                } else if ("/stock/101".equals(argument)) {
                  return new ResourceResolver()
                      .getResourceAsStream("classpath:2019-11-20_stock_101_164.json")
                      .get();
                }
                return null;
              }
            })
        .when(mkmClient)
        .get(any());

    // Act
    List<Article> stock = sut.getStock();

    // Assert
    assertEquals(164, stock.size());
    Article article = stock.get(0);
    assertEquals(Long.valueOf(404456472), article.getIdArticle());
    assertEquals(Long.valueOf(14), article.getIdProduct());
    assertEquals(Long.valueOf(1), article.getLanguage().getIdLanguage());
    assertEquals("English", article.getLanguage().getLanguageName());
    assertEquals("", article.getComments());
    assertEquals(Double.valueOf(0.25), article.getPrice());
    assertEquals(Integer.valueOf(1), article.getCount());
    assertEquals(Boolean.FALSE, article.getInShoppingCart());
    assertEquals(Long.valueOf(1), article.getProduct().getIdGame());
    assertEquals("Loxodon Punisher", article.getProduct().getEnName());
    assertEquals("Loxodon Punisher", article.getProduct().getLocName());
    assertEquals("/srv/home/www/img/items/1/MRD/14.jpg", article.getProduct().getImage());
    assertEquals("Mirrodin", article.getProduct().getExpansion());
    assertEquals("14", article.getProduct().getNr());
    assertEquals("43", article.getProduct().getExpIcon());
    assertEquals("Rare", article.getProduct().getRarity());
    assertEquals(LocalDateTime.of(2019, 4, 18, 23, 45, 12), article.getLastEdited());
    assertEquals("EX", article.getCondition());
    assertEquals(Boolean.FALSE, article.getIsFoil());
    assertEquals(Boolean.FALSE, article.getIsSigned());
    assertEquals(Boolean.FALSE, article.getIsPlayset());
    assertEquals(Boolean.FALSE, article.getIsAltered());
  }
}

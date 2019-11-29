package com.decksy.api.mkm.marketplace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;

import io.micronaut.core.io.ResourceResolver;

class MarketPlaceServiceImplTest {

  @Test
  void getProduct() throws IOException, HttpException {
    // Arrange
    MkmClient mkmClient = mock(MkmClient.class);
    MarketPlaceServiceImpl sut = spy(new MarketPlaceServiceImpl(mkmClient));

    Optional<InputStream> inputStream =
        new ResourceResolver().getResourceAsStream("classpath:2019-11-29_product.json");
    Mockito.doReturn(inputStream.get()).when(mkmClient).get("/products/1");

    // Act
    Optional<Product> product = sut.getProduct(Long.valueOf(1));

    // Assert
    assertEquals(Boolean.TRUE, product.isPresent());
    Product mkmProduct = product.get();
    assertEquals(14, mkmProduct.getIdProduct());
    assertEquals(3374, mkmProduct.getIdMetaproduct());
    assertEquals(1, mkmProduct.getCountReprints());
    assertEquals("Loxodon Punisher", mkmProduct.getEnName());
    assertEquals("Loxodon-Bestrafer", mkmProduct.getLocName());
    assertEquals("/en/Magic/Products/Singles/Mirrodin/Loxodon-Punisher", mkmProduct.getWebsite());
    assertEquals("/srv/home/www/img/items/1/MRD/14.jpg", mkmProduct.getImage());
    assertEquals("Magic the Gathering", mkmProduct.getGameName());
    assertEquals("Magic Single", mkmProduct.getCategoryName());
    assertEquals(1, mkmProduct.getIdGame());
    assertEquals("14", mkmProduct.getNumber());
    assertEquals("Rare", mkmProduct.getRarity());
    assertEquals(0.22, mkmProduct.getPriceGuide().getSell());
    assertEquals(0.02, mkmProduct.getPriceGuide().getLow());
    assertEquals(0.02, mkmProduct.getPriceGuide().getLowex());
    assertEquals(0.45, mkmProduct.getPriceGuide().getLowfoil());
    assertEquals(0.36, mkmProduct.getPriceGuide().getAvg());
    assertEquals(0.29, mkmProduct.getPriceGuide().getTrend());
    assertEquals(1, mkmProduct.getPriceGuide().getTrendfoil());

    assertEquals(2461, mkmProduct.getCountArticles());
    assertEquals(80, mkmProduct.getCountFoils());
  }
}

package com.decksy.api.mkm.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;

import io.micronaut.core.io.ResourceResolver;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class AccountServiceImplTest {

  @Test
  void get_account() throws IOException, HttpException {
    // Arrange
    MkmClient mkmClient = mock(MkmClient.class);
    AccountServiceImpl sut = spy(new AccountServiceImpl(mkmClient));

    Optional<InputStream> inputStream =
        new ResourceResolver().getResourceAsStream("classpath:2019-11-18_account.json");
    Mockito.doReturn(inputStream.get()).when(mkmClient).get("/account");

    // Act
    Account account = sut.getAccount();

    // Assert
    assertEquals(Long.valueOf(12345), account.getIdUser());
    assertEquals("Bingo", account.getUsername());
    assertEquals("CH", account.getCountry());
    assertEquals(Integer.valueOf(0), account.getIsCommercial());
    assertEquals(Boolean.TRUE, account.getMaySell());
    assertEquals(Integer.valueOf(3), account.getSellerActivation());
    assertEquals(Integer.valueOf(0), account.getRiskGroup());
    assertEquals("0 - 2%", account.getLossPercentage());
    assertEquals(Integer.valueOf(2), account.getReputation());
    assertEquals(Integer.valueOf(-1), account.getShipsFast());
    assertEquals(Integer.valueOf(71), account.getSellCount());
    assertEquals(Integer.valueOf(154), account.getSoldItems());
    assertEquals(Integer.valueOf(1), account.getAvgShippingTime());
    assertEquals(Boolean.FALSE, account.getOnVacation());
    assertEquals(Long.valueOf(3), account.getIdDisplayLanguage());
    assertEquals("Bingo", account.getName().getFirstName());
    assertEquals("Bongo", account.getName().getLastName());
    assertEquals("Bingo Bongo", account.getHomeAddress().getName());
    assertEquals(null, account.getHomeAddress().getExtra());
    assertEquals("Bingostrasse 1", account.getHomeAddress().getStreet());
    assertEquals("1234", account.getHomeAddress().getZip());
    assertEquals("Bongo", account.getHomeAddress().getCity());
    assertEquals("CH", account.getHomeAddress().getCountry());
    assertEquals("bingo.bongo@gmail.com", account.getEmail());
    assertEquals("41-123456789", account.getPhoneNumber());
    assertEquals(null, account.getVat());
    assertEquals("", account.getLegalInformation());
    assertEquals(LocalDateTime.of(2017, 1, 4, 14, 16, 49), account.getRegisterDate());
    assertEquals(Boolean.TRUE, account.getIsActivated());
    assertEquals(Double.valueOf(100.00), account.getMoneyDetails().getMoneyBalance());
    assertEquals(Double.valueOf(100.00), account.getMoneyDetails().getTotalBalance());
    assertEquals(Double.valueOf(0), account.getMoneyDetails().getBonusBalance());
    assertEquals(Double.valueOf(0), account.getMoneyDetails().getUnpaidAmount());
    assertEquals(Double.valueOf(0), account.getMoneyDetails().getProviderRechargeAmount());
    assertEquals("Bingo Bongo", account.getBankAccount().getAccountOwner());
    assertEquals("CH123123123123123R", account.getBankAccount().getIban());
    assertEquals("BINGOCH6Z", account.getBankAccount().getBic());
    assertEquals("Bingo", account.getBankAccount().getBankName());
    assertEquals(Integer.valueOf(0), account.getArticlesInShoppingCart());
    assertEquals(Integer.valueOf(0), account.getUnreadMessages());
  }
}

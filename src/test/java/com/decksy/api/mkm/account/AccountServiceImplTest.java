package com.decksy.api.mkm.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import com.decksy.api.mkm.HttpException;
import com.decksy.api.mkm.MkmClient;
import io.micronaut.core.io.ResourceResolver;
import io.micronaut.test.annotation.MicronautTest;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@MicronautTest
public class AccountServiceImplTest {

  @Test
  void get_account() throws IOException, HttpException {
    // Arrange
    MkmClient mkmClient = mock(MkmClient.class);
    AccountServiceImpl sut = spy(new AccountServiceImpl(mkmClient));

    Optional<InputStream> inputStream =new ResourceResolver().getResourceAsStream("classpath:2019-11-18_account.json");
    Mockito.doReturn(inputStream.get()).when(mkmClient).get("/account");

    // Act
    Account account = sut.get_account();

    // Assert
    assertEquals(account.getIdUser(), Long.valueOf(12345));
    assertEquals(account.getUsername(), "Bingo");
    assertEquals(account.getCountry(), "CH");
    assertEquals(account.getIsCommercial(), Integer.valueOf(0));
    assertEquals(account.getMaySell(), Boolean.TRUE);
    assertEquals(account.getSellerActivation(), Integer.valueOf(3));
    assertEquals(account.getRiskGroup(), Integer.valueOf(0));
    assertEquals(account.getLossPercentage(), "0 - 2%");
    assertEquals(account.getReputation(), Integer.valueOf(2));
    assertEquals(account.getShipsFast(), Integer.valueOf(-1));
    assertEquals(account.getSellCount(), Integer.valueOf(71));
    assertEquals(account.getSoldItems(), Integer.valueOf(154));
    assertEquals(account.getAvgShippingTime(), Integer.valueOf(1));
    assertEquals(account.getOnVacation(), Boolean.FALSE);
    assertEquals(account.getIdDisplayLanguage(), Long.valueOf(3));
    assertEquals(account.getName().getFirstName(), "Bingo");
    assertEquals(account.getName().getLastName(), "Bongo");
    assertEquals(account.getHomeAddress().getName(),"Bingo Bongo");
    assertEquals(account.getHomeAddress().getExtra(), null);
    assertEquals(account.getHomeAddress().getStreet(), "Bingostrasse 1");
    assertEquals(account.getHomeAddress().getZip(), "1234");
    assertEquals(account.getHomeAddress().getCity(), "Bongo");
    assertEquals(account.getHomeAddress().getCountry(), "CH");
    assertEquals(account.getEmail(), "bingo.bongo@gmail.com");
    assertEquals(account.getPhoneNumber(), "41-123456789");
    assertEquals(account.getVat(), null);
    assertEquals(account.getLegalInformation(), "");
    assertEquals(account.getRegisterDate(), LocalDateTime.of(2017, 1, 4, 14, 16, 49));
    assertEquals(account.getIsActivated(), Boolean.TRUE);
    assertEquals(account.getMoneyDetails().getMoneyBalance(), Double.valueOf(100.00));
    assertEquals(account.getMoneyDetails().getTotalBalance(), Double.valueOf(100.00));
    assertEquals(account.getMoneyDetails().getBonusBalance(), Double.valueOf(0));
    assertEquals(account.getMoneyDetails().getUnpaidAmount(), Double.valueOf(0));
    assertEquals(account.getMoneyDetails().getProviderRechargeAmount(), Double.valueOf(0));
    assertEquals(account.getBankAccount().getAccountOwner(), "Bingo Bongo");
    assertEquals(account.getBankAccount().getIban(), "CH123123123123123R");
    assertEquals(account.getBankAccount().getBic(), "BINGOCH6Z");
    assertEquals(account.getBankAccount().getBankName(), "Bingo");
    assertEquals(account.getArticlesInShoppingCart(), Integer.valueOf(0));
    assertEquals(account.getUnreadMessages(), Integer.valueOf(0));

  }
}

package com.decksy.api.mkm.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class Account {
  private Long idUser;
  private String username;
  private String country;
  private Integer isCommercial;
  private Boolean maySell;
  private Integer sellerActivation;
  private Integer riskGroup;
  private String lossPercentage;
  private Integer reputation;
  private Integer shipsFast;
  private Integer sellCount;
  private Integer soldItems;
  private Integer avgShippingTime;
  private Boolean onVacation;
  private Long idDisplayLanguage;
  private Name name;
  private HomeAddress homeAddress;
  private String email;
  private String phoneNumber;
  private String vat;
  private String legalInformation;

  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ssX",
      with = JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
  private LocalDateTime registerDate;

  private Boolean isActivated;
  private MoneyDetails moneyDetails;
  private BankAccount bankAccount;
  private Integer articlesInShoppingCart;
  private Integer unreadMessages;

  public Long getIdUser() {
    return idUser;
  }

  public void setIdUser(Long idUser) {
    this.idUser = idUser;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getIsCommercial() {
    return isCommercial;
  }

  public void setIsCommercial(Integer isCommercial) {
    this.isCommercial = isCommercial;
  }

  public Boolean getMaySell() {
    return maySell;
  }

  public void setMaySell(Boolean maySell) {
    this.maySell = maySell;
  }

  public Integer getSellerActivation() {
    return sellerActivation;
  }

  public void setSellerActivation(Integer sellerActivation) {
    this.sellerActivation = sellerActivation;
  }

  public Integer getRiskGroup() {
    return riskGroup;
  }

  public void setRiskGroup(Integer riskGroup) {
    this.riskGroup = riskGroup;
  }

  public String getLossPercentage() {
    return lossPercentage;
  }

  public void setLossPercentage(String lossPercentage) {
    this.lossPercentage = lossPercentage;
  }

  public Integer getReputation() {
    return reputation;
  }

  public void setReputation(Integer reputation) {
    this.reputation = reputation;
  }

  public Integer getShipsFast() {
    return shipsFast;
  }

  public void setShipsFast(Integer shipsFast) {
    this.shipsFast = shipsFast;
  }

  public Integer getSellCount() {
    return sellCount;
  }

  public void setSellCount(Integer sellCount) {
    this.sellCount = sellCount;
  }

  public Integer getSoldItems() {
    return soldItems;
  }

  public void setSoldItems(Integer soldItems) {
    this.soldItems = soldItems;
  }

  public Integer getAvgShippingTime() {
    return avgShippingTime;
  }

  public void setAvgShippingTime(Integer avgShippingTime) {
    this.avgShippingTime = avgShippingTime;
  }

  public Boolean getOnVacation() {
    return onVacation;
  }

  public void setOnVacation(Boolean onVacation) {
    this.onVacation = onVacation;
  }

  public Long getIdDisplayLanguage() {
    return idDisplayLanguage;
  }

  public void setIdDisplayLanguage(Long idDisplayLanguage) {
    this.idDisplayLanguage = idDisplayLanguage;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public HomeAddress getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(HomeAddress homeAddress) {
    this.homeAddress = homeAddress;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getVat() {
    return vat;
  }

  public void setVat(String vat) {
    this.vat = vat;
  }

  public String getLegalInformation() {
    return legalInformation;
  }

  public void setLegalInformation(String legalInformation) {
    this.legalInformation = legalInformation;
  }

  public LocalDateTime getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(LocalDateTime registerDate) {
    this.registerDate = registerDate;
  }

  public Boolean getIsActivated() {
    return isActivated;
  }

  public void setIsActivated(Boolean isActivated) {
    this.isActivated = isActivated;
  }

  public MoneyDetails getMoneyDetails() {
    return moneyDetails;
  }

  public void setMoneyDetails(MoneyDetails moneyDetails) {
    this.moneyDetails = moneyDetails;
  }

  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public Integer getArticlesInShoppingCart() {
    return articlesInShoppingCart;
  }

  public void setArticlesInShoppingCart(Integer articlesInShoppingCart) {
    this.articlesInShoppingCart = articlesInShoppingCart;
  }

  public Integer getUnreadMessages() {
    return unreadMessages;
  }

  public void setUnreadMessages(Integer unreadMessages) {
    this.unreadMessages = unreadMessages;
  }

  @Override
  public String toString() {
    return "Account{"
        + "idUser="
        + idUser
        + ", username='"
        + username
        + '\''
        + ", country='"
        + country
        + '\''
        + ", isCommercial="
        + isCommercial
        + ", maySell="
        + maySell
        + ", sellerActivation="
        + sellerActivation
        + ", riskGroup="
        + riskGroup
        + ", lossPercentage='"
        + lossPercentage
        + '\''
        + ", reputation="
        + reputation
        + ", shipsFast="
        + shipsFast
        + ", sellCount="
        + sellCount
        + ", soldItems="
        + soldItems
        + ", avgShippingTime="
        + avgShippingTime
        + ", onVacation="
        + onVacation
        + ", idDisplayLanguage="
        + idDisplayLanguage
        + ", name="
        + name
        + ", homeAddress="
        + homeAddress
        + ", email='"
        + email
        + '\''
        + ", phoneNumber='"
        + phoneNumber
        + '\''
        + ", vat='"
        + vat
        + '\''
        + ", legalInformation='"
        + legalInformation
        + '\''
        + ", registerDate='"
        + registerDate
        + '\''
        + ", isActivated='"
        + isActivated
        + '\''
        + ", moneyDetails="
        + moneyDetails
        + ", bankAccount="
        + bankAccount
        + ", articlesInShoppingCart='"
        + articlesInShoppingCart
        + '\''
        + ", unreadMessages='"
        + unreadMessages
        + '\''
        + '}';
  }
}

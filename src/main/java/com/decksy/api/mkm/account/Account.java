package com.decksy.api.mkm.account;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

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

  public Account setIdUser(Long idUser) {
    this.idUser = idUser;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public Account setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public Account setCountry(String country) {
    this.country = country;
    return this;
  }

  public Integer getIsCommercial() {
    return isCommercial;
  }

  public Account setIsCommercial(Integer isCommercial) {
    this.isCommercial = isCommercial;
    return this;
  }

  public Boolean getMaySell() {
    return maySell;
  }

  public Account setMaySell(Boolean maySell) {
    this.maySell = maySell;
    return this;
  }

  public Integer getSellerActivation() {
    return sellerActivation;
  }

  public Account setSellerActivation(Integer sellerActivation) {
    this.sellerActivation = sellerActivation;
    return this;
  }

  public Integer getRiskGroup() {
    return riskGroup;
  }

  public Account setRiskGroup(Integer riskGroup) {
    this.riskGroup = riskGroup;
    return this;
  }

  public String getLossPercentage() {
    return lossPercentage;
  }

  public Account setLossPercentage(String lossPercentage) {
    this.lossPercentage = lossPercentage;
    return this;
  }

  public Integer getReputation() {
    return reputation;
  }

  public Account setReputation(Integer reputation) {
    this.reputation = reputation;
    return this;
  }

  public Integer getShipsFast() {
    return shipsFast;
  }

  public Account setShipsFast(Integer shipsFast) {
    this.shipsFast = shipsFast;
    return this;
  }

  public Integer getSellCount() {
    return sellCount;
  }

  public Account setSellCount(Integer sellCount) {
    this.sellCount = sellCount;
    return this;
  }

  public Integer getSoldItems() {
    return soldItems;
  }

  public Account setSoldItems(Integer soldItems) {
    this.soldItems = soldItems;
    return this;
  }

  public Integer getAvgShippingTime() {
    return avgShippingTime;
  }

  public Account setAvgShippingTime(Integer avgShippingTime) {
    this.avgShippingTime = avgShippingTime;
    return this;
  }

  public Boolean getOnVacation() {
    return onVacation;
  }

  public Account setOnVacation(Boolean onVacation) {
    this.onVacation = onVacation;
    return this;
  }

  public Long getIdDisplayLanguage() {
    return idDisplayLanguage;
  }

  public Account setIdDisplayLanguage(Long idDisplayLanguage) {
    this.idDisplayLanguage = idDisplayLanguage;
    return this;
  }

  public Name getName() {
    return name;
  }

  public Account setName(Name name) {
    this.name = name;
    return this;
  }

  public HomeAddress getHomeAddress() {
    return homeAddress;
  }

  public Account setHomeAddress(HomeAddress homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public Account setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Account setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getVat() {
    return vat;
  }

  public Account setVat(String vat) {
    this.vat = vat;
    return this;
  }

  public String getLegalInformation() {
    return legalInformation;
  }

  public Account setLegalInformation(String legalInformation) {
    this.legalInformation = legalInformation;
    return this;
  }

  public LocalDateTime getRegisterDate() {
    return registerDate;
  }

  public Account setRegisterDate(LocalDateTime registerDate) {
    this.registerDate = registerDate;
    return this;
  }

  public Boolean getActivated() {
    return isActivated;
  }

  public Account setActivated(Boolean activated) {
    isActivated = activated;
    return this;
  }

  public MoneyDetails getMoneyDetails() {
    return moneyDetails;
  }

  public Account setMoneyDetails(MoneyDetails moneyDetails) {
    this.moneyDetails = moneyDetails;
    return this;
  }

  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public Account setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  public Integer getArticlesInShoppingCart() {
    return articlesInShoppingCart;
  }

  public Account setArticlesInShoppingCart(Integer articlesInShoppingCart) {
    this.articlesInShoppingCart = articlesInShoppingCart;
    return this;
  }

  public Integer getUnreadMessages() {
    return unreadMessages;
  }

  public Account setUnreadMessages(Integer unreadMessages) {
    this.unreadMessages = unreadMessages;
    return this;
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

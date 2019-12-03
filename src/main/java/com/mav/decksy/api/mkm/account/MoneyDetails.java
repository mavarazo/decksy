package com.mav.decksy.api.mkm.account;

public class MoneyDetails {
  private Double totalBalance;
  private Double moneyBalance;
  private Double bonusBalance;
  private Double unpaidAmount;
  private Double providerRechargeAmount;

  public Double getTotalBalance() {
    return totalBalance;
  }

  public MoneyDetails setTotalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public Double getMoneyBalance() {
    return moneyBalance;
  }

  public MoneyDetails setMoneyBalance(Double moneyBalance) {
    this.moneyBalance = moneyBalance;
    return this;
  }

  public Double getBonusBalance() {
    return bonusBalance;
  }

  public MoneyDetails setBonusBalance(Double bonusBalance) {
    this.bonusBalance = bonusBalance;
    return this;
  }

  public Double getUnpaidAmount() {
    return unpaidAmount;
  }

  public MoneyDetails setUnpaidAmount(Double unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
    return this;
  }

  public Double getProviderRechargeAmount() {
    return providerRechargeAmount;
  }

  public MoneyDetails setProviderRechargeAmount(Double providerRechargeAmount) {
    this.providerRechargeAmount = providerRechargeAmount;
    return this;
  }

  @Override
  public String toString() {
    return "MoneyDetails{"
        + "totalBalance='"
        + totalBalance
        + '\''
        + ", moneyBalance='"
        + moneyBalance
        + '\''
        + ", bonusBalance='"
        + bonusBalance
        + '\''
        + ", unpaidAmount='"
        + unpaidAmount
        + '\''
        + ", providerRechargeAmount='"
        + providerRechargeAmount
        + '\''
        + '}';
  }
}

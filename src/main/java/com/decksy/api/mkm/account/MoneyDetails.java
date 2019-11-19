package com.decksy.api.mkm.account;

public class MoneyDetails {
  private Double totalBalance;
  private Double moneyBalance;
  private Double bonusBalance;
  private Double unpaidAmount;
  private Double providerRechargeAmount;

  public Number getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
  }

  public Double getMoneyBalance() {
    return moneyBalance;
  }

  public void setMoneyBalance(Double moneyBalance) {
    this.moneyBalance = moneyBalance;
  }

  public Double getBonusBalance() {
    return bonusBalance;
  }

  public void setBonusBalance(Double bonusBalance) {
    this.bonusBalance = bonusBalance;
  }

  public Double getUnpaidAmount() {
    return unpaidAmount;
  }

  public void setUnpaidAmount(Double unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
  }

  public Double getProviderRechargeAmount() {
    return providerRechargeAmount;
  }

  public void setProviderRechargeAmount(Double providerRechargeAmount) {
    this.providerRechargeAmount = providerRechargeAmount;
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

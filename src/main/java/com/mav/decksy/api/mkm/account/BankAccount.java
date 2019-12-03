package com.mav.decksy.api.mkm.account;

public class BankAccount {
  private String accountOwner;
  private String iban;
  private String bic;
  private String bankName;

  public String getAccountOwner() {
    return accountOwner;
  }

  public BankAccount setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  public String getIban() {
    return iban;
  }

  public BankAccount setIban(String iban) {
    this.iban = iban;
    return this;
  }

  public String getBic() {
    return bic;
  }

  public BankAccount setBic(String bic) {
    this.bic = bic;
    return this;
  }

  public String getBankName() {
    return bankName;
  }

  public BankAccount setBankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  @Override
  public String toString() {
    return "BankAccount{"
        + "accountOwner='"
        + accountOwner
        + '\''
        + ", iban='"
        + iban
        + '\''
        + ", bic='"
        + bic
        + '\''
        + ", bankName='"
        + bankName
        + '\''
        + '}';
  }
}

package com.decksy.api.mkm.account;

public class BankAccount {
  private String accountOwner;
  private String iban;
  private String bic;
  private String bankName;

  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
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

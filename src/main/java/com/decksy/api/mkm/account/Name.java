package com.decksy.api.mkm.account;

public class Name {
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public Name setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Name setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @Override
  public String toString() {
    return "Name{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }
}

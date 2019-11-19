package com.decksy.api.mkm.account;

public class HomeAddress {
  private String name;
  private String extra;
  private String street;
  private String zip;
  private String city;
  private String country;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "HomeAddress{"
        + "name='"
        + name
        + '\''
        + ", extra='"
        + extra
        + '\''
        + ", street='"
        + street
        + '\''
        + ", zip='"
        + zip
        + '\''
        + ", city='"
        + city
        + '\''
        + ", country='"
        + country
        + '\''
        + '}';
  }
}

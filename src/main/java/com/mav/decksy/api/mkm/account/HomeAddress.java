package com.mav.decksy.api.mkm.account;

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

  public HomeAddress setName(String name) {
    this.name = name;
    return this;
  }

  public String getExtra() {
    return extra;
  }

  public HomeAddress setExtra(String extra) {
    this.extra = extra;
    return this;
  }

  public String getStreet() {
    return street;
  }

  public HomeAddress setStreet(String street) {
    this.street = street;
    return this;
  }

  public String getZip() {
    return zip;
  }

  public HomeAddress setZip(String zip) {
    this.zip = zip;
    return this;
  }

  public String getCity() {
    return city;
  }

  public HomeAddress setCity(String city) {
    this.city = city;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public HomeAddress setCountry(String country) {
    this.country = country;
    return this;
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

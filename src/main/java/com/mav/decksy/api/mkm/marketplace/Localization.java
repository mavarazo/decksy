package com.mav.decksy.api.mkm.marketplace;

public class Localization {
  private String name;
  private Long idLanguage;
  private String languageName;

  public String getName() {
    return name;
  }

  public Localization setName(String name) {
    this.name = name;
    return this;
  }

  public Long getIdLanguage() {
    return idLanguage;
  }

  public Localization setIdLanguage(Long idLanguage) {
    this.idLanguage = idLanguage;
    return this;
  }

  public String getLanguageName() {
    return languageName;
  }

  public Localization setLanguageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  @Override
  public String toString() {
    return "Localization{"
        + "name='"
        + name
        + '\''
        + ", idLanguage='"
        + idLanguage
        + '\''
        + ", languageName='"
        + languageName
        + '\''
        + '}';
  }
}

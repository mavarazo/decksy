package com.mav.decksy.api.mkm.stock;

public class Language {
  private Long idLanguage;
  private String languageName;

  public Long getIdLanguage() {
    return idLanguage;
  }

  public Language setIdLanguage(Long idLanguage) {
    this.idLanguage = idLanguage;
    return this;
  }

  public String getLanguageName() {
    return languageName;
  }

  public Language setLanguageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  @Override
  public String toString() {
    return "Language{"
        + "idLanguage="
        + idLanguage
        + ", languageName='"
        + languageName
        + '\''
        + '}';
  }
}

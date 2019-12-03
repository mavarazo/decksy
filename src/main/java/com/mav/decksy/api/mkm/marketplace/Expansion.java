package com.mav.decksy.api.mkm.marketplace;

public class Expansion {
  private Long idExpansion;
  private String enName;
  private Long expansionIcon;

  public Long getIdExpansion() {
    return idExpansion;
  }

  public Expansion setIdExpansion(Long idExpansion) {
    this.idExpansion = idExpansion;
    return this;
  }

  public String getEnName() {
    return enName;
  }

  public Expansion setEnName(String enName) {
    this.enName = enName;
    return this;
  }

  public Long getExpansionIcon() {
    return expansionIcon;
  }

  public Expansion setExpansionIcon(Long expansionIcon) {
    this.expansionIcon = expansionIcon;
    return this;
  }

  @Override
  public String toString() {
    return "Expansion{"
        + "idExpansion="
        + idExpansion
        + ", enName='"
        + enName
        + '\''
        + ", expansionIcon="
        + expansionIcon
        + '}';
  }
}

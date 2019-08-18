package com.decksy.dto;

import javax.validation.constraints.NotBlank;

public class CardCriteriaDto {

  @NotBlank(message = "Name is mandatory")
  private String name;

  public String getName() {
    return name;
  }

  public CardCriteriaDto setName(String name) {
    this.name = name;
    return this;
  }
}

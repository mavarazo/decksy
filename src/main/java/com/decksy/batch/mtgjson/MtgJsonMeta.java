package com.decksy.batch.mtgjson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;

@JsonIgnoreProperties(value = {"pricesDate"})
public class MtgJsonMeta {

  @JsonDeserialize(using = StringLocalDateJsonDeserializer.class)
  private LocalDate date;

  private String version;

  public LocalDate getDate() {
    return date;
  }

  public MtgJsonMeta setDate(LocalDate date) {
    this.date = date;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public MtgJsonMeta setVersion(String version) {
    this.version = version;
    return this;
  }
}

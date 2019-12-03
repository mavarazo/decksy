package com.mav.decksy.api.mkm.marketplace;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PriceGuide {
  @JsonAlias(value = "SELL")
  private Double sell;

  @JsonAlias(value = "LOW")
  private Double low;

  @JsonAlias(value = "LOWEX")
  private Double lowex;

  @JsonAlias(value = "LOWFOIL")
  private Double lowfoil;

  @JsonAlias(value = "AVG")
  private Double avg;

  @JsonAlias(value = "TREND")
  private Double trend;

  @JsonAlias(value = "TRENDFOIL")
  private Double trendfoil;

  public Double getSell() {
    return sell;
  }

  public PriceGuide setSell(Double sell) {
    this.sell = sell;
    return this;
  }

  public Double getLow() {
    return low;
  }

  public PriceGuide setLow(Double low) {
    this.low = low;
    return this;
  }

  public Double getLowex() {
    return lowex;
  }

  public PriceGuide setLowex(Double lowex) {
    this.lowex = lowex;
    return this;
  }

  public Double getLowfoil() {
    return lowfoil;
  }

  public PriceGuide setLowfoil(Double lowfoil) {
    this.lowfoil = lowfoil;
    return this;
  }

  public Double getAvg() {
    return avg;
  }

  public PriceGuide setAvg(Double avg) {
    this.avg = avg;
    return this;
  }

  public Double getTrend() {
    return trend;
  }

  public PriceGuide setTrend(Double trend) {
    this.trend = trend;
    return this;
  }

  public Double getTrendfoil() {
    return trendfoil;
  }

  public PriceGuide setTrendfoil(Double trendfoil) {
    this.trendfoil = trendfoil;
    return this;
  }

  @Override
  public String toString() {
    return "PriceGuide{"
        + "sell="
        + sell
        + ", low="
        + low
        + ", lowex="
        + lowex
        + ", lowfoil="
        + lowfoil
        + ", avg="
        + avg
        + ", trend="
        + trend
        + ", trendfoil="
        + trendfoil
        + '}';
  }
}

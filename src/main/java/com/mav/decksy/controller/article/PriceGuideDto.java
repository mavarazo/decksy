package com.mav.decksy.controller.article;

public class PriceGuideDto {
  private Double sell;
  private Double low;
  private Double lowex;
  private Double lowfoil;
  private Double avg;
  private Double trend;
  private Double trendfoil;

   public Double getSell() {
      return sell;
   }

   public PriceGuideDto setSell(Double sell) {
      this.sell = sell;
      return this;
   }

   public Double getLow() {
      return low;
   }

   public PriceGuideDto setLow(Double low) {
      this.low = low;
      return this;
   }

   public Double getLowex() {
      return lowex;
   }

   public PriceGuideDto setLowex(Double lowex) {
      this.lowex = lowex;
      return this;
   }

   public Double getLowfoil() {
      return lowfoil;
   }

   public PriceGuideDto setLowfoil(Double lowfoil) {
      this.lowfoil = lowfoil;
      return this;
   }

   public Double getAvg() {
      return avg;
   }

   public PriceGuideDto setAvg(Double avg) {
      this.avg = avg;
      return this;
   }

   public Double getTrend() {
      return trend;
   }

   public PriceGuideDto setTrend(Double trend) {
      this.trend = trend;
      return this;
   }

   public Double getTrendfoil() {
      return trendfoil;
   }

   public PriceGuideDto setTrendfoil(Double trendfoil) {
      this.trendfoil = trendfoil;
      return this;
   }
}

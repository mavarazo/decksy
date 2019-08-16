package com.decksy.dto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class DeckDto {

  private long id;
  private LocalDate created;
  private LocalDate updated;

  @NotBlank(message = "Name is mandatory")
  private String name;

  private String notes;

   public long getId() {
      return id;
   }

   public DeckDto setId(long id) {
      this.id = id;
      return this;
   }

   public LocalDate getCreated() {
      return created;
   }

   public DeckDto setCreated(LocalDate created) {
      this.created = created;
      return this;
   }

   public LocalDate getUpdated() {
      return updated;
   }

   public DeckDto setUpdated(LocalDate updated) {
      this.updated = updated;
      return this;
   }

   public String getName() {
      return name;
   }

   public DeckDto setName(String name) {
      this.name = name;
      return this;
   }

   public String getNotes() {
      return notes;
   }

   public DeckDto setNotes(String notes) {
      this.notes = notes;
      return this;
   }
}

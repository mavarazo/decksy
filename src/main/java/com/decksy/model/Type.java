package com.decksy.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "types")
public class Type {

   @Id @GeneratedValue private long id;
   @CreatedDate private LocalDate created;
   @LastModifiedDate private LocalDate updated;

   private String type;

   public long getId() {
      return id;
   }

   public LocalDate getCreated() {
      return created;
   }

   public Type setCreated(LocalDate created) {
      this.created = created;
      return this;
   }

   public LocalDate getUpdated() {
      return updated;
   }

   public Type setUpdated(LocalDate updated) {
      this.updated = updated;
      return this;
   }

   public String getType() {
      return type;
   }

   public Type setType(String type) {
      this.type = type;
      return this;
   }
}

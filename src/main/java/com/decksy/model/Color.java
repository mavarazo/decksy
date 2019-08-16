package com.decksy.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "colors")
public class Color {

  @Id @GeneratedValue private long id;
  @CreatedDate private LocalDate created;
  @LastModifiedDate private LocalDate updated;

  private String color;

  public long getId() {
    return id;
  }

  public LocalDate getCreated() {
    return created;
  }

  public Color setCreated(LocalDate created) {
    this.created = created;
    return this;
  }

  public LocalDate getUpdated() {
    return updated;
  }

  public Color setUpdated(LocalDate updated) {
    this.updated = updated;
    return this;
  }

  public String getColor() {
    return color;
  }

  public Color setColor(String color) {
    this.color = color;
    return this;
  }
}

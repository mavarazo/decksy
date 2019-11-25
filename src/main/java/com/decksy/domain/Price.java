package com.decksy.domain;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "prices")
public class Price {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreationTimestamp private LocalDateTime createDateTime;

  @UpdateTimestamp private LocalDateTime updateDateTime;

  @ManyToOne
  @JoinColumn(name = "article_id")
  private Article article;

  private Double price;

  public Long getId() {
    return id;
  }

  public Price setId(Long id) {
    this.id = id;
    return this;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public Price setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public Price setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  public Article getArticle() {
    return article;
  }

  public Price setArticle(Article article) {
    this.article = article;
    return this;
  }

  public Double getPrice() {
    return price;
  }

  public Price setPrice(Double price) {
    this.price = price;
    return this;
  }

  @Override
  public String toString() {
    return "Price{"
        + "id="
        + id
        + ", createDateTime="
        + createDateTime
        + ", updateDateTime="
        + updateDateTime
        + ", article="
        + article
        + ", price="
        + price
        + '}';
  }
}

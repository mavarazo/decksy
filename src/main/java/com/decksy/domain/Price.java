package com.decksy.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

  @ManyToOne private Article article;

  private BigDecimal price;

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

  public BigDecimal getPrice() {
    return price;
  }

  public Price setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }
}

package com.mav.decksy.controller.article;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;

public class ResponseEntity<T> extends org.springframework.http.ResponseEntity<T> {

  private List<T> value;

  public ResponseEntity(T body, HttpStatus status) {
    super(body, status);

    this.value = Arrays.asList(body);
  }
}

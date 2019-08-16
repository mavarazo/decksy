package com.decksy.service.mtg;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CardApiImpl {

  public List<Card> fetchCardsByFilters() {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.add("user-agent", "Mozilla/5.0");
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

    ResponseEntity<Cards> result =
        restTemplate.exchange(
            "https://api.magicthegathering.io/v1/cards?name=\"Archangel Avacyn\"",
            HttpMethod.GET,
            entity,
            new ParameterizedTypeReference<Cards>() {});

    if (result.getStatusCode() != HttpStatus.OK || result.getBody() == null) {
      return Collections.emptyList();
    }

    return result.getBody().getCards();
  }

}

package com.decksy.batch.mtgjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class MtgJsonItemProcessorTest {

  @Test
  public void process() throws IOException {
    // Arrange
    File file = ResourceUtils.getFile(this.getClass().getResource("/allsets.json"));

    ObjectMapper objectMapper = new ObjectMapper();

    // Act
    Map<String, MtgJsonSet> result =
        objectMapper.readValue(file, new TypeReference<Map<String, MtgJsonSet>>() {});

    // Assert
    assertThat(result, is(notNullValue()));
  }
}

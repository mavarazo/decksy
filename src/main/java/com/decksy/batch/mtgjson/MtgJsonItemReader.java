package com.decksy.batch.mtgjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.util.Map;

public class MtgJsonItemReader extends AbstractItemCountingItemStreamItemReader
    implements ResourceAwareItemReaderItemStream, InitializingBean {
  private static final Logger LOGGER = LoggerFactory.getLogger(MtgJsonItemReader.class);

  private Resource resource;
  private Map items;
  private int index = 0;
  private ObjectMapper objectMapper;

  public MtgJsonItemReader() {
    setName(ClassUtils.getShortName(MtgJsonItemReader.class));
    this.objectMapper = new ObjectMapper();
  }

  @Override
  protected Object doRead() throws Exception {
    return (this.items == null || index >= this.items.size()) ? null : this.items.get(index++);
  }

  @Override
  protected void doOpen() throws Exception {
    Assert.notNull(resource, "Input resource must be set");

    if (!resource.exists()) {
      LOGGER.warn("Input resource does not exist " + resource.getDescription());
      return;
    }

    if (!resource.isReadable()) {
      LOGGER.warn("Input resource is not readable " + resource.getDescription());
      return;
    }

    try {
      this.items =
          this.objectMapper.readValue(
              resource.getInputStream(), new TypeReference<Map<String, MtgJsonSet>>() {});
    } catch (Exception ex) {
      throw new ParseException("Parsing error", ex);
    }
  }

  @Override
  protected void doClose() throws Exception {}

  @Override
  public void setResource(Resource resource) {
    this.resource = resource;
  }

  @Override
  public void afterPropertiesSet() throws Exception {}
}

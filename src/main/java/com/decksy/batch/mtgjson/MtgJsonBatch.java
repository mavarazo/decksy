package com.decksy.batch.mtgjson;

import com.decksy.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@Configuration
public class MtgJsonBatch {
  private static final Logger LOGGER = LoggerFactory.getLogger(MtgJsonItemProcessor.class);

  @Bean
  public Job job(JobBuilderFactory jobBuilders, StepBuilderFactory stepBuilders) {
    return jobBuilders.get("mtgJsonJob").start(step(stepBuilders)).build();
  }

  @Bean
  public Step step(StepBuilderFactory stepBuilders) {
    return stepBuilders
        .get("mtgJsonStep")
        .<Map<String, MtgJsonSet>, Card>chunk(10)
        .reader(reader(null))
        .processor(processor())
        .writer(writer())
        .build();
  }

  @Bean
  @StepScope
  public MtgJsonItemReader reader(@Value("#{jobParameters[url]}") String url) {
    try {
      MtgJsonItemReader reader = new MtgJsonItemReader();
      Path path = Paths.get(new URL(url).toURI());
      reader.setResource(new FileSystemResource(path.toFile()));
      return reader;
    } catch (Exception e) {
      LOGGER.error(e.getLocalizedMessage(), e);
    }
    return null;
  }

  @Bean
  public ItemProcessor processor() {
    return new MtgJsonItemProcessor();
  }

  @Bean
  public MtgJsonItemWriter writer() {
    return new MtgJsonItemWriter();
  }
}

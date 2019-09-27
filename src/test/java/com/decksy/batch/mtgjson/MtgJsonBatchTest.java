package com.decksy.batch.mtgjson;

import com.decksy.BatchConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.batch.operations.NoSuchJobException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MtgJsonBatchTest.BatchTestConfig.class})
public class MtgJsonBatchTest {

  @Autowired private JobLauncherTestUtils jobLauncherTestUtils;
  @MockBean JsonItemReader jsonItemReader;

  @Test
  public void testHelloWorldJob() throws Exception {
    // Arrange
    JobParameters jobParameters =
        new JobParametersBuilder()
            .addString("url", this.getClass().getResource("/allsets.json").toString())
            .toJobParameters();

    // Act
    JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

    // Assert
    assertThat(jobExecution.getExitStatus().getExitCode(), is("COMPLETED"));
  }

  @Configuration
  @Import({BatchConfig.class, MtgJsonBatch.class})
  static class BatchTestConfig {

    @Autowired private Job mtgJsonJob;

    @Bean
    JobLauncherTestUtils jobLauncherTestUtils() throws NoSuchJobException {
      JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
      jobLauncherTestUtils.setJob(mtgJsonJob);

      return jobLauncherTestUtils;
    }
  }
}

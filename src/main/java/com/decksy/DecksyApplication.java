package com.decksy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DecksyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecksyApplication.class, args);
	}

}

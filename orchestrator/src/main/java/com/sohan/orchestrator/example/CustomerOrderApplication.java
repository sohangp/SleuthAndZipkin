package com.sohan.orchestrator.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The spring boot application class, that starts the app.
 */
@SpringBootApplication
public class CustomerOrderApplication {

	/**
	 * Main method that starts the Spring Boot application.
	 *
	 * @param args Arguments passed to the app.
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderApplication.class, args);
	}

	@Bean
	RestTemplate restTemplaet(){
		return new RestTemplate();
	}
}

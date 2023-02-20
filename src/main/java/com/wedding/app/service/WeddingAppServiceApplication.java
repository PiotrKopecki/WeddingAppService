package com.wedding.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class WeddingAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeddingAppServiceApplication.class, args);
	}

}

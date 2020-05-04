package com.megahack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.megahack.domain.repository") 
@EntityScan("com.megahack.domain.model")
@SpringBootApplication
public class Maisque100Application {

	public static void main(String[] args) {
		SpringApplication.run(Maisque100Application.class, args);
	}

}

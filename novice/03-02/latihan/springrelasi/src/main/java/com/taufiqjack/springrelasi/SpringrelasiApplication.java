package com.taufiqjack.springrelasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringrelasiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrelasiApplication.class, args);
	}

}

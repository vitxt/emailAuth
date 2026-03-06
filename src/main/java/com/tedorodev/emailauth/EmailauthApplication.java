package com.tedorodev.emailauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class EmailauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailauthApplication.class, args);
	}

}

package com.btphat.spicynoodles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpicynoodlesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpicynoodlesApplication.class, args);
	}

}

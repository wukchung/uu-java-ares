package com.workshop.ares_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class AresProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AresProxyApplication.class, args);
	}

}

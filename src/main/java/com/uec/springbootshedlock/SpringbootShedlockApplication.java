package com.uec.springbootshedlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootShedlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShedlockApplication.class, args);
	}
}

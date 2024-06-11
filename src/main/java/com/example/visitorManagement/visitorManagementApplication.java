package com.example.visitorManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class visitorManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(visitorManagementApplication.class, args);
	}

}

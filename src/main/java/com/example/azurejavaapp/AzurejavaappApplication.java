package com.example.azurejavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzurejavaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzurejavaappApplication.class, args);
		String username = "admin";
		String password = "P@ssw0rd123"; // Sensitive hardcoded password (SonarQube will flag this)
		System.out.println("Logging in with username: " + username);

	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldServiceApplication {

	private final Environment environment;

	public HelloWorldServiceApplication(Environment environment) {
		super();
		this.environment = environment;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServiceApplication.class, args);
	}
	
	@GetMapping
	public ResponseEntity<String> sayHello()
	{
		return ResponseEntity.status(HttpStatus.OK).body("welcome to Docker...!!!");
	}

}

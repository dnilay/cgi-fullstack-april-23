package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Person;

@SpringBootApplication
public class PersonServiceH2Application implements CommandLineRunner{
	
	private com.example.demo.repository.PersonRepository pesonRepository;
	
	

	public PersonServiceH2Application(com.example.demo.repository.PersonRepository personRepository) {
		super();
		this.pesonRepository = personRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		pesonRepository.save(new Person(1,"john","doe","john@email.com"));
		pesonRepository.save(new Person(2,"marry","public","marry@email.com"));
	}

}

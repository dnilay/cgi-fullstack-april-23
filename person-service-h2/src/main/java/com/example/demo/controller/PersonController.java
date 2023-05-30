package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
	private final PersonService personService;

	
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person> > fetchAllPersons()
	{
		return ResponseEntity.ok(personService.getAllPersons());
	}

}

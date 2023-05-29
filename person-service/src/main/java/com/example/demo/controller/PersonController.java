package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	private PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@PostMapping("/persons")
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {

		Person p=personService.createPerson(person);
	
		
		return ResponseEntity.status(HttpStatus.CREATED).body(p);
		
	}
	
	
	@GetMapping("/persons")
	public ResponseEntity<Collection<Person>> getAllPersons()
	{
		return ResponseEntity.ok().body(personService.getAllPersons());
	}
	
	@GetMapping("/persons/{personId}")
	public ResponseEntity<?> getPersonById(@PathVariable("personId") Integer personid)
	{
		Person p=personService.getPeresonByIdPerson(personid);
		System.out.println(p);
		
		if(p==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("person with id: "+personid+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(p);
		}
	}

}

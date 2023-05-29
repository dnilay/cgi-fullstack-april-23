package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	public Person createPerson(Person person);
	
	public List<Person> getAllPersons();
}

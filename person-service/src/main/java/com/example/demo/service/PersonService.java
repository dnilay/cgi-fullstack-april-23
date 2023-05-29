package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Person;

public interface PersonService {

	public Person createPerson(Person person);

	public Collection<Person> getAllPersons();

	public Person getPeresonByIdPerson(Integer personId);

	public Person updatePersonById(Integer personId, Person person);

	public Person findByFirstName(String name);
	
	public Person updateByFirstName(String name);
}

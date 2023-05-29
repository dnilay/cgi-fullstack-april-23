package com.example.demo.repo;

import java.util.Collection;

import com.example.demo.model.Person;

public interface PersonRepository {
	public Person createPerson(Person person);
	
	public Collection<Person> getAllPersons();
	
	public Person getPeresonByIdPerson(Integer personId);

}

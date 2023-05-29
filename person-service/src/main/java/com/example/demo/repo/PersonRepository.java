package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonRepository {
	public Person createPerson(Person person);
	
	public List<Person> getAllPersons();

}

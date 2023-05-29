package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	public Person createPerson(Person person);
	
	public Collection<Person> getAllPersons();
	public Person getPeresonByIdPerson(Integer personId);

}

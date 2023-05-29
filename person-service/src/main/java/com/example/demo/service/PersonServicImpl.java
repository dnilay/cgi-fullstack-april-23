package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;

@Service
public class PersonServicImpl implements PersonService {

	private final PersonRepository personRepository;

	public PersonServicImpl(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.createPerson(person);
	}

	@Override
	public Collection<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.getAllPersons();
	}

	@Override
	public Person getPeresonByIdPerson(Integer personId) {
		// TODO Auto-generated method stub

		return personRepository.getPeresonByIdPerson(personId);

	}

	@Override
	public Person updatePersonById(Integer personId, Person person) {
		// TODO Auto-generated method stub
		return personRepository.updatePersonById(personId, person);
	}

}

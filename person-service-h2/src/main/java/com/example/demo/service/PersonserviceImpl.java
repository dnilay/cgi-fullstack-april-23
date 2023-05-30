package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonserviceImpl implements PersonService {

	private final com.example.demo.repository.PersonRepository personRepository;

	public PersonserviceImpl(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

}

package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	private List<Person> persons=null;
	
	{
		persons=new ArrayList<Person>();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return persons;
	}

}

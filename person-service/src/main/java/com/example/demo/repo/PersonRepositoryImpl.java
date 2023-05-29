package com.example.demo.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	private Map<Integer,Person> persons=null;
	
	{
		persons=new HashMap<Integer,Person>();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		persons.put(person.getPersonId(),person);
		return person;
	}

	@Override
	public Collection<Person> getAllPersons() {
		// TODO Auto-generated method stub
		System.out.println(persons);
		return persons.values();
	}

	@Override
	public Person getPeresonByIdPerson(Integer personId) {
		// TODO Auto-generated method stub
		Person thePerson=persons.get(personId);
		
		System.out.println(thePerson);
		if(thePerson==null )
		{
			return null;
		}
		else
			return thePerson;
		
	}

}

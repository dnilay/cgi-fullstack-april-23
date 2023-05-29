package com.example.demo.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	private Map<Integer, Person> persons = null;

	{
		persons = new HashMap<Integer, Person>();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		persons.put(person.getPersonId(), person);
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
		Person thePerson = persons.get(personId);

		System.out.println(thePerson);
		if (thePerson == null) {
			return null;
		} else
			return thePerson;

	}

	@Override
	public Person updatePersonById(Integer personId, Person person) {
		// TODO Auto-generated method stub
		Person thePerson = persons.get(personId);

		if (thePerson == null) {
			return null;
		} else
			thePerson.setFirstName(person.getFirstName());
		thePerson.setLastName(person.getLastName());
		thePerson.setEmail(person.getEmail());
		return thePerson;

		
	}

	@Override
	public Person findByFirstName(String name) {
		// TODO Auto-generated method stub
		Person tempPerson=null;
		Collection<Person> personCollection=persons.values();
		for(Person p:personCollection)
		{
			if(p.getFirstName().equals(name))
			{
				tempPerson=p;
				break;
			}
		}
		return tempPerson;
	}

	@Override
	public Person updateByFirstName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

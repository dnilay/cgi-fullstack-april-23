package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;

@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {

		Query query = entityManager.createQuery("FROM Customer", Customer.class);

		return query.getResultList();
	}

	@Override
	@Transactional
	public Customer createCustomer(Customer customer) {
	
		//save or update
		 entityManager.merge(customer);
		 
		return customer ;
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		Customer customer= entityManager.find(Customer.class, theId);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		Customer customer= entityManager.find(Customer.class, theId);
		entityManager.remove(customer);
	}

}

package com.example.demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;

@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao {
	
	private final SessionFactory sessionFactory;
	

	
	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("FROM Customer",Customer.class);
		@SuppressWarnings("unchecked")
		List<Customer> customers=query.getResultList();
		return customers;
	}


	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.save(customer);
		return customer;
	}

}

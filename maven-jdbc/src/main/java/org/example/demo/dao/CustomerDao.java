package org.example.demo.dao;

import java.sql.SQLException;

import org.example.demo.model.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer) throws SQLException;

}

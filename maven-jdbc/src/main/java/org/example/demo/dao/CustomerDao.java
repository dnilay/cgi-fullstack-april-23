package org.example.demo.dao;

import java.sql.SQLException;
import java.util.List;

import org.example.demo.model.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer) throws SQLException;

	public List<Customer> getAllCustomers() throws SQLException;
	
	public void deleteCustomerById(int customerId) throws SQLException;
	
	public void updateCustomer(int customerId,String firstName,String lastName,String email) throws SQLException;
	
	public void findCustomerByid(int customerId) throws SQLException;
}

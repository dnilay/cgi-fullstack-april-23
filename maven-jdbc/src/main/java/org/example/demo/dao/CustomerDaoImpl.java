package org.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.example.demo.factory.MySqlConnectionFactory;
import org.example.demo.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	{
		try {
			connection = MySqlConnectionFactory.getMySqlconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub

		PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getFirstName());
		preparedStatement.setString(3, customer.getLastName());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.executeUpdate();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<Customer>();

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from customer");

		while (resultSet.next()) {
			list.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}
		return list;
	}

	@Override
	public void deleteCustomerById(int customerId) throws SQLException {
		// TODO Auto-generated method stub

		PreparedStatement preparedStatement = connection.prepareStatement("delete  from customer where customer_id=?");
		preparedStatement.setInt(1, customerId);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("customer with " + customerId + " removed sucessfully...");
		} else {
			System.out.println("no such record found........!!");
		}

	}

}

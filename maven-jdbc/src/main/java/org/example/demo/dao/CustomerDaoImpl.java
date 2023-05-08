package org.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.demo.factory.MySqlConnectionFactory;
import org.example.demo.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;

	{
		try {
			connection=MySqlConnectionFactory.getMySqlconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into customer values(?,?,?,?)");
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getFirstName());
		preparedStatement.setString(3, customer.getLastName());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.executeUpdate();
		return customer;
	}

}

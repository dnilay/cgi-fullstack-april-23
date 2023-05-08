package org.example.demo;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import org.example.demo.dao.CustomerDao;
import org.example.demo.dao.CustomerDaoImpl;
import org.example.demo.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
    	CustomerDao customerDao=new CustomerDaoImpl();
        System.out.print("Enter First Name: ");
        String fName=scanner.next();
        System.out.print("Enter Last Name: ");
        String lName=scanner.next();
        System.out.print("Enter Email: ");
        String email=scanner.next();
        try {
			Customer customer=customerDao.createCustomer(new Customer(new Random().nextInt(),fName,lName,email));
			
			System.out.println("Customer Created: "+customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

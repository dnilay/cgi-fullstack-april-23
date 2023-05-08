package org.example.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.example.demo.dao.CustomerDao;
import org.example.demo.dao.CustomerDaoImpl;
import org.example.demo.model.Customer;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		CustomerDao customerDao = new CustomerDaoImpl();
		int choice = 0;

		do {

			System.out.println("1. Create New customer.");
			System.out.println("2. Display all Available customer.");
			System.out.println("3. Delete A Customer By Cudtomer ID.");
			System.out.println("4. Update A Customer By Cudtomer ID.");
			System.out.println("0. Exit.");
			System.out.print("Enter Your Choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter First Name: ");
				String fName = scanner.next();
				System.out.print("Enter Last Name: ");
				String lName = scanner.next();
				System.out.print("Enter Email: ");
				String email = scanner.next();
				Customer customer = customerDao
						.createCustomer(new Customer(new Random().nextInt(1000), fName, lName, email));

				System.out.println("Customer Created: " + customer);
				break;
			case 2:

				List<Customer> list = customerDao.getAllCustomers();
				if(list.isEmpty())
				{
					System.out.println("customer table is empty.");
				}

				else
				{
					for (Customer c : list) {
						System.out.println(c);
					}
				}
				
				break;
			case 3:

				System.out.print("enter id: ");

				int id = scanner.nextInt();
				customerDao.deleteCustomerById(id);
				break;
			case 4:
				System.out.print("Enter Customer id: ");
				id=scanner.nextInt();
				System.out.print("Enter First Name: ");
				fName = scanner.next();
				System.out.print("Enter Last Name: ");
				lName = scanner.next();
				System.out.print("Enter Email: ");
				email = scanner.next();
				customerDao.updateCustomer(id, fName, lName, email);
				break;
				
			case 0:
				System.out.println("bye...");
				System.exit(1);
				break;

			default:
				System.out.println("Invalid choice try again");
				break;
			}

		} while (choice != 0);

	}
}

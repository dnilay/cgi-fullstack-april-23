package com.example;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Tester {
	
	
	public static void main(String args[])
	{
		EmployeeService service=new EmployeeServiceImpl();
		Employee e=new Employee();
		e.setEmployeeId(1);
		e.setFirstName("John");
		e.setLastName("doe");
		e.setEmail("john@email.com");
		service.createEmployee(e);
		service.createEmployee(e);
		e.setEmployeeId(1);
		e.setFirstName("John");
		e.setLastName("Doe");
		e.setEmail("john@email.com");
		service.createEmployee(e);
		Employee e2=new Employee();
		e2.setEmployeeId(2);
		e2.setFirstName("Marry");
		e2.setLastName("Public");
		e2.setEmail("marry@email.com");
		service.createEmployee(e2);
		
		Set<Employee> s=service.getAllEmployees();
		
		Iterator<Employee> e1=s.iterator();
		while(e1.hasNext())
		{
			System.out.println(e1.next());
		}
		
		Employee tempEmployee=service.findEmployeeById(1);
		if(tempEmployee==null)
		{
			System.out.println("not found");
			
		}
		else
		{
			System.out.println("found"+tempEmployee);
		}
		
	}

}

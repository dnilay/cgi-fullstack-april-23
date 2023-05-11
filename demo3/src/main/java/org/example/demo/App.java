package org.example.demo;

import org.example.demo.model.Department;
import org.example.demo.model.Employee;
import org.example.demo.model.Location;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Employee myEmployee=context.getBean("employee",Employee.class);
        myEmployee.setEmployeeId(100);
        myEmployee.setFirstName("John");
        myEmployee.setLastName("Doe");
        myEmployee.setEmail("john@email.com");
        Department d= myEmployee.getDepartment();
        d.setDepartmentId(200);
        d.setDepartmentName("Sales");
        Location  l=myEmployee.getDepartment().getLocation();
        l.setLocationId(300);
        l.setCity("Kolkata");
        l.setCountry("India");
        d.setLocation(l);
        myEmployee.setDepartment(d);
        System.out.println(myEmployee);
    }
}

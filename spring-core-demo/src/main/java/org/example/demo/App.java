package org.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext applicationContext=null;
      
      applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    //  Coach theCoach=applicationContext.getBean("coach",Coach.class);
      
      Employee employee=applicationContext.getBean("e",Employee.class);
      //System.out.println(theCoach.getDailyWorkout());
      System.out.println(employee);
      
    }
}

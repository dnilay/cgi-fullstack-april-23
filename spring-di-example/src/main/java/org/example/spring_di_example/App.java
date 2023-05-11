package org.example.spring_di_example;

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
        
		/*
		 * Coach theCoach=context.getBean("coach",Coach.class);
		 * 
		 * System.out.println(theCoach.getDailyWorkout()+" ===> "+theCoach.
		 * getDailyFortune());
		 */
        
        Person person=context.getBean("person",Person.class);
        
        System.out.println(person);
    }
}

package org.example.demo;

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
        
        CricketCoach myCoach=context.getBean("theCoach",CricketCoach.class);
        System.out.println(myCoach);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmail());
        System.out.println(myCoach.getTeam());
        CricketCoach myCoach1=context.getBean("theCoach",CricketCoach.class);
        System.out.println(myCoach1);
        
        System.out.println(myCoach==myCoach1);
    }
}

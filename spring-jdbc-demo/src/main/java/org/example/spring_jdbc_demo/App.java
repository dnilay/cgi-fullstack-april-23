package org.example.spring_jdbc_demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	try {
    		
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		DataSource dataSource=context.getBean("dataSource",DriverManagerDataSource.class);
    		
    		Connection connection=dataSource.getConnection();
    		
    		System.out.println(connection);
    		System.out.println("connection succeed");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
}

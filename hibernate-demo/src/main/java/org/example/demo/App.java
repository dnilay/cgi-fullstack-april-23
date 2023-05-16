package org.example.demo;

import java.util.Scanner;

import javax.persistence.Query;

import org.example.demo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.openSession();
        session.getTransaction().begin();
		/*
		 * session.save(new Student(200, "Marry", "Public", "marry@email.com"));
		 * System.out.println("student created..."); Query
		 * query=session.createQuery("FROM Student"); java.util.List<Student> students=
		 * query.getResultList(); for(Student s:students) { System.out.println(s); }
		 */
        
        System.out.print("Enter Student ID: ");
        
        int id=scanner.nextInt();
        
        Student student=session.find(Student.class, id);
        
        if(student==null)
        {
        	System.out.println("no such id..");
        }
        else
        {
        	System.out.println("Found: "+student);
        }
        session.getTransaction().commit();
       
    }
}

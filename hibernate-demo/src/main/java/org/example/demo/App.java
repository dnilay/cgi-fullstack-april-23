package org.example.demo;

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
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.openSession();
        session.getTransaction().begin();
        session.save(new Student(100, "John", "Doe", "john@email.com"));
        session.getTransaction().commit();
        System.out.println("student created...");
    }
}

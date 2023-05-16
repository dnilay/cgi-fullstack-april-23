package org.example.demo;

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
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.openSession();
        session.getTransaction().begin();
        session.save(new Student(200, "Marry", "Public", "marry@email.com"));
        System.out.println("student created...");
        Query query=session.createQuery("FROM Student");
        java.util.List<Student> students= query.getResultList();
        for(Student s:students)
        {
        	System.out.println(s);
        }
        
        session.getTransaction().commit();
       
    }
}

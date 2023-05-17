package org.example.demo;

import org.example.demo.service.StudentService;
import org.example.demo.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	StudentService studentService=new StudentServiceImpl();
    	
    	//studentService.deleteStudentById(100);
    	studentService.deleteAllStudents();
    	
    }
}

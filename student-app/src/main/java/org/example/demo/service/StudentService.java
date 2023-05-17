package org.example.demo.service;

import org.example.demo.model.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public void deleteStudentById(int studentId);
	public void deleteAllStudents();

}

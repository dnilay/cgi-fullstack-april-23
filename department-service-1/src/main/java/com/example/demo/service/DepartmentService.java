package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Department;

public interface DepartmentService {
	
	Department createDepartment(Department department);
	Optional<Department> getDepartmentById(int departmentId);

}

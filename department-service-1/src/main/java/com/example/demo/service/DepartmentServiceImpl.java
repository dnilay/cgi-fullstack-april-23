package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	private final DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Optional<Department> getDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId);
	}

}

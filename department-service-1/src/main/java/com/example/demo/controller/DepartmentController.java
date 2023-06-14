package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/departments")
@AllArgsConstructor
public class DepartmentController {
	
	
	private final DepartmentService departmentService;
	
	@PostMapping
	public Department createDepartment(@RequestBody Department department)
	{
		return departmentService.createDepartment(department);
	}
	@GetMapping("/{departmentId}")
	public Optional<Department> findDepartment(@PathVariable("departmentId") int departmentId)
	{
		return departmentService.getDepartmentById(departmentId);
	}

}

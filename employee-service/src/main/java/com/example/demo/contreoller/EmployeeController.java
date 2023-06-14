package com.example.demo.contreoller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

	
	private final EmployeeService employeeService;
	
	private final RestTemplate restTemplate;
	
	@PostMapping
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee)
	{
	
		Department department=restTemplate.getForObject("http://localhost:8082/department-service/departments/{employeeId}",Department.class, Map.of("employeeId",employee.getDepartmentId()));
		employee.setDepartmentName(department.getDepartmentName());
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
	}
	
}

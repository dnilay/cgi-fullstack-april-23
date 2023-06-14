package com.example.demo.contreoller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.ErrorResponseModel;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
@ControllerAdvice
public class EmployeeController {

	
	private final EmployeeService employeeService;
	
	private final RestTemplate restTemplate;
	@ExceptionHandler(value = DepartmentNotFoundException.class)
	public ResponseEntity<?> handleException(DepartmentNotFoundException e)
	{
		ErrorResponseModel model=new ErrorResponseModel();
		model.setMessage(e.getMessage());
		model.setStatusCode(HttpStatus.NOT_FOUND.value());
		model.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}
	
	@PostMapping
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee)
	{
	
		Department department=restTemplate.getForObject("http://localhost:8082/department-service/departments/{employeeId}",Department.class, Map.of("employeeId",employee.getDepartmentId()));
		if(department==null)
		{
			throw new DepartmentNotFoundException("Department with department id "+employee.getDepartmentId()+" not found");
		}
		employee.setDepartmentName(department.getDepartmentName());
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
	}
	
}

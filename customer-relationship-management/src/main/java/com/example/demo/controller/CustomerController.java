package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Controller
public class CustomerController {
	
	private final CustomerDao customerDao;
	
	

	
	public CustomerController(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
@GetMapping
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = customerDao.getAllCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
}

package org.example.demo.controller;

import org.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("student", new Student());
		return "showForm";
	}
	@RequestMapping(method = RequestMethod.POST,path = "/processForm")
	public String processForm(@ModelAttribute("student") Student ss, Model theModel)
	{
		theModel.addAttribute("s", ss);
		return "processForm";
	}
	
}

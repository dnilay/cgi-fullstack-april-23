package org.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showIndex()
	{
		return "index";
	}
	@RequestMapping(method =RequestMethod.POST,path = "/hello")
	public String sayHello(@RequestParam("t1") String str,Model theModel)
	{
		System.out.println(str);
		//request.setAttribute("ATTR1", request.getParameter("t1"));
		
		theModel.addAttribute("ATTR1",str );
		return "hello";
	}

}

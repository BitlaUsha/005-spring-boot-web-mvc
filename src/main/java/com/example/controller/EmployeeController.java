package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
  //1. show Employee Register page
	@GetMapping("/register")
	public String showEmpReg() {
		return "EmpRegister";
	}
	
	//2. read from data on click submit
	@PostMapping("/create")
	public String readfromData(
			@ModelAttribute Employee employee,
			Model model
			
			)
	{
		System.out.println("FROM DATA IS =>" + employee);
		model.addAttribute("eob", employee);
		return "EmpSuccess";
	}
}

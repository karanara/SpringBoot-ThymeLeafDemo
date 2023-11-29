package com.practice.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.springboot.thymeleafdemo.model.Student;

@Controller
public class StudentController {
 
    @Value("${countries}")
	private List<String> countries;
    
    @Value("${languages}")
    private List<String> languages;
 
	@GetMapping("/showStudentform")
	public String getStudentDetails(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		theModel.addAttribute("countries", countries);
		theModel.addAttribute("languages",languages);
		return "student-form";
		
	}
	
	@PostMapping("/processStudentForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		
		return "student-confirmation";
		
	}
}

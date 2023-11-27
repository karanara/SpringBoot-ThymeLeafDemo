package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.springboot.thymeleafdemo.model.Student;

@Controller
public class StudentController {

 
	@GetMapping("/showStudentform")
	public String getStudentDetails(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
		
	}
	
	@PostMapping("/processStudentForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		System.out.println("Student Details  " + theStudent.getFirstName() + "  " +theStudent.getLastName());
		
		return "student-confirmation";
		
	}
}

package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldRestController {

	//controller to show the initial form
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-html";
	}
	//controller to process the form
	@RequestMapping("/processForm")
	public String processform() {
		return "helloworld1";
	}
	
	//controller to read form data
	@RequestMapping("/formdata")
	//
	//public String readFormData(HttpServletRequest request,Model model ) {
	public String readFormData(@RequestParam("studentName") String theName, Model model) {
		//String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		String result="hello Hii" + theName;
		model.addAttribute("message", result);
		return "helloworld1";
	}
}

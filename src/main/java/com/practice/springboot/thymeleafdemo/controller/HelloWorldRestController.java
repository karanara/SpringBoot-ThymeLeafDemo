package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

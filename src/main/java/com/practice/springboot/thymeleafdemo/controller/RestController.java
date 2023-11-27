package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

	//create a mapping for "/hello";
	@GetMapping("/hello")
	public String getHelloWorld(Model themodel) {
		themodel.addAttribute("theDate", new java.util.Date());
		return "helloWorld";
	}
}

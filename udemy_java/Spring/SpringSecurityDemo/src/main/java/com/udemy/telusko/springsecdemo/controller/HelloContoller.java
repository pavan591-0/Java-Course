package com.udemy.telusko.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloContoller {
	
	@GetMapping("/home")
	public String greet(HttpServletRequest req) {
		// return "Hello World " + req.getSession().getId() ;
		return "Hello World";
	}

	
	
}

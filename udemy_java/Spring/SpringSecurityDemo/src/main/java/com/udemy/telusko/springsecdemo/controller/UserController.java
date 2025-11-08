package com.udemy.telusko.springsecdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.telusko.springsecdemo.model.User;
import com.udemy.telusko.springsecdemo.service.JwtService;
import com.udemy.telusko.springsecdemo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		Authentication auth = authenticationManager.authenticate(
								new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));
		if(auth.isAuthenticated()) { 
			return jwtService.generateToken(user.getName());
		}
		return "failed";
	}
}

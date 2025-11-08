package com.udemy.telusko.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.udemy.telusko.springsecdemo.model.User;
import com.udemy.telusko.springsecdemo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public User registerUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

}

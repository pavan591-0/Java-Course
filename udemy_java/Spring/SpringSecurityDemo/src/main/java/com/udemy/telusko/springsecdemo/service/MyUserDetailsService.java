package com.udemy.telusko.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.udemy.telusko.springsecdemo.model.User;
import com.udemy.telusko.springsecdemo.model.UserDetailsImpl;
import com.udemy.telusko.springsecdemo.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByName(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserDetailsImpl(user);
	}

}

package com.udemy.telusko.springsecdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.telusko.springsecdemo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	User findByName(String username);
}

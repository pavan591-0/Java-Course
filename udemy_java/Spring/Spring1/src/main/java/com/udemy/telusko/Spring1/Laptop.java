package com.udemy.telusko.Spring1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public Laptop(){
		System.out.println("Laptop object created.");
	}
	
	public void compile() {
		System.out.println("Using Laptop to watch anime...");
	}
}

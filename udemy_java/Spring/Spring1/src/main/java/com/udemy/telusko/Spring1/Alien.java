package com.udemy.telusko.Spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("45")
	private int x;
//	int y;
	
//	@Autowired
//	@Qualifier("desktop")
	private Computer comp;
	
	public Alien(){
		System.out.println("ALien Object Created.");
	}
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		// System.out.println("In Setter");
		this.x = x;
	}
	
	public Alien(int x, Computer comp) {
		super();
		this.x = x;
		this.comp = comp;
	}

	public Computer getComp() {
		return comp;
	}
	
	@Autowired
//	@Qualifier("laptop")
	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public void sayHi() {
		System.out.println("Hi, Konichiwa");
		comp.compile();
	}
	
}

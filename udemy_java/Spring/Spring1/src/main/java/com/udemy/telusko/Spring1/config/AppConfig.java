package com.udemy.telusko.Spring1.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.udemy.telusko.Spring1.Alien;
import com.udemy.telusko.Spring1.Computer;
import com.udemy.telusko.Spring1.Desktop;
import com.udemy.telusko.Spring1.Laptop;

@Configuration
@ComponentScan("com.udemy.telusko.spring1")
public class AppConfig {
	
//	optional:- public Alien alien(@autowired Computer comp)
//	In case 2 comp type object exists we can use Qualifier
//	public Alien alien(@Qualifier("desktop") Computer comp) {}
//	@Bean
//	public Alien alien(Computer comp) {
//		
//		Alien obj = new Alien();
//		obj.setX(24);
//// 		obj.setComp(desktop());
//		obj.setComp(comp);
//		return obj;
		
//	}
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
	
//	@Bean(name= {"com2", "desktop", "navap"})
//	@Bean
////	@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
}

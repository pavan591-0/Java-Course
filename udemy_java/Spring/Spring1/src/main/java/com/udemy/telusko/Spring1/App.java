package com.udemy.telusko.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.telusko.Spring1.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Alien obj1 = context.getBean(Alien.class);
	    obj1.sayHi();
	    System.out.println("x= "+obj1.getX());
    	
//    	Desktop des = context.getBean(Desktop.class);
//    	des.compile();
    	
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Alien obj1 = context.getBean(Alien.class);
//        obj1.sayHi();
//        System.out.println("x= "+obj1.getX());
//        System.out.println("y= "+obj1.y);
//        Alien obj2 = (Alien)context.getBean("alien2");
//        obj2.sayHi();
//        Alien obj2 = (Alien)context.getBean("alien1");
//        obj2.sayHi();
        
    }
}

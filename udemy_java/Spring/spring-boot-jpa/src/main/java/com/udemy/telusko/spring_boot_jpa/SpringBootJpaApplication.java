package com.udemy.telusko.spring_boot_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udemy.telusko.spring_boot_jpa.model.Student;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
//		s1.setRollNo(100);
//		s1.setName("Naruto");
//		s1.setMarks(95);
//		
//		s2.setRollNo(101);
//		s2.setName("Itachi");
//		s2.setMarks(83);
//		
//		s3.setRollNo(102);
//		s3.setName("Hinata");
//		s3.setMarks(98);
		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		
//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(102));
//		System.out.println(repo.findById(104));
//		System.out.println(repo.findById(106).orElse(null));
		
//		System.out.println(repo.findByName("Itachi"));
//		System.out.println(repo.findByMarks(95));
//		System.out.println(repo.findByMarksGreaterThan(90));
//		System.out.println(repo.findByMarksLessThan(100));
		
//		update
//		repo.save(s2);
//		System.out.println(repo.findById(101));
		
//		delete
//		repo.delete(s2);
		
		
//		System.out.println(repo.findAll());
		
	}

}

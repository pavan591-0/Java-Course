package com.udemy.telusko.spring_boot_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.udemy.telusko.spring_boot_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	// @Query("Select s from Student s where s.name= ?1")
	// we don't have to write query because by default jpa already creates some methods
	// look below for some examples
	List<Student> findByName(String name);

	List<Student> findByMarks(int marks);

	List<Student> findByMarksGreaterThan(int marks);

	List<Student> findByMarksLessThan(int marks);

}

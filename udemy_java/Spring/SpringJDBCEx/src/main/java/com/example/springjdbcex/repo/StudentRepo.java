package com.example.springjdbcex.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.springjdbcex.model.Student;

@Repository
public class StudentRepo {
	
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student s) {
		String sql = "insert into student(rollno, name, marks) values(?, ?, ?)";
		int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
		System.out.println(rows+ " effected.");
	}

	public List<Student> findAll() {
		
		String sql = "select * from student";
		
//		RowMapper<Student> mapper = (rs, rowNum) -> {
//				Student s = new Student();
//				s.setRollNo(rs.getInt(1));
//				s.setName(rs.getString(2));
//				s.setMarks(rs.getInt(3));
//				return s;
//		};
		
		return jdbc.query(sql, (rs, rowNum) -> {
			Student s = new Student();
			s.setRollNo(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setMarks(rs.getInt(3));
			return s;
		});
	}

}

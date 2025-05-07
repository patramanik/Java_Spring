package com.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query="insert into student values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}

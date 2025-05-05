package com.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.entity.Student;


public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		String quary = "insert into student values(?,?,?)";
		
		int noOfItem = this.jdbcTemplate.update(quary,student.getId(),student.getName(),student.getCity());
		
		return noOfItem;
	}

	@Override
	public int update(Student student) {
		
		String quary = "UPDATE student set city=? where id = ?";
		
		int noOfItem = this.jdbcTemplate.update(quary,student.getCity(),student.getId());
		
		
		return noOfItem;
	}
	
	@Override
	public int delete(Student student) {
		
		String quary = "delete from student where id = ?";
		
		int noOfItem = this.jdbcTemplate.update(quary,student.getId());
		
		return noOfItem;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	
	

}

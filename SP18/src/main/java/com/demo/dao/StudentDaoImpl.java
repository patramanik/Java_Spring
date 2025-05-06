package com.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.entity.Student;


public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	RowMapperImpl rowMap;
	
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
	
	@Override
	public Student getOneStudent(int id) {
		
		String quary = "select * from student where id=?";
		
		 rowMap = new RowMapperImpl();
		
//		Student student = (Student) this.jdbcTemplate.queryForRowSet(quary, rowMap, id);
		
		Student student  = this.jdbcTemplate.queryForObject(quary, rowMap, id);
		
		
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		String quary = "select * from student";
		
		rowMap = new RowMapperImpl();
		
		List<Student> allStudents = this.jdbcTemplate.query(quary, rowMap);
		
		return allStudents;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	
	

}

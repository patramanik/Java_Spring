package com.demo.dao;

import java.util.List;

import com.demo.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getOneStudent(int id);
	
	public List<Student> getAllStudent();
	
}

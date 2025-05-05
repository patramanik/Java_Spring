package com.demo.dao;

import com.demo.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
}

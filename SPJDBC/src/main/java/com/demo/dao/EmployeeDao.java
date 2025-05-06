package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeDao {
	
	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(Employee employee);
	
	public Employee getOneEmployee(int id);
	
	public List<Employee> getAllEmployee();
	


}

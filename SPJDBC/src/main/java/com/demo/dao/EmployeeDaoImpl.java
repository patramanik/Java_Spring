package com.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	
	private EmployeeDaoImpl employeeDaoImpl;
	
	RowMapperImpl  rowMap;

	@Override
	public int insert(Employee employee) {
		
		String query = "insert into employee values(?,?,?);";
		
		int result = this.jdbcTemplate.update(query, employee.getId(),employee.getName(),employee.getCity());
		
		return result;
	}
	
	@Override
	public int update(Employee employee) {
		String query ="update employee set name = ? where id=?";
		
		int result = this.jdbcTemplate.update(query,employee.getName(),employee.getId());
		
		return result;
	}
	
	
	
	@Override
	public int delete(Employee employee) {
		String query = "delete from employee where id =?";
		
		int result = this.jdbcTemplate.update(query,employee.getId());
		return result;
	}
	
	@Override
	public Employee getOneEmployee(int id) {
		
		String query ="Select * from employee where id =?";
		
		rowMap = new RowMapperImpl();
		
		Employee emp = this.jdbcTemplate.queryForObject(query, rowMap, id);
		
		
		return emp;
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		
		String query ="select * from employee";
		
		rowMap = new RowMapperImpl();
		
		List<Employee> emp = this.jdbcTemplate.query(query, rowMap);
		
		return emp;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmployeeDaoImpl getEmployeeDaoImpl() {
		return employeeDaoImpl;
	}

	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}
	
	
	

}

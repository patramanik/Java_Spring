package com.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.dao.StudentDaoImpl;



@Configuration
public class StudentConfig {

	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/springdb");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	
	@Bean
	public StudentDaoImpl getStudentDao() {
		
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getJdbcTemplate());
		
		return studentDao;
	}
}

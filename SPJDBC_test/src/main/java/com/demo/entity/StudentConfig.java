package com.demo.entity;

import java.security.PublicKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	public Internship getInterenship() {
		return new Internship();
	}
	

	@Bean
	public Student getStudent() {
		return new Student(getInterenship());
		
	}
	
}

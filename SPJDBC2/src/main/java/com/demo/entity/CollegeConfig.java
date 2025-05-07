package com.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CollegeConfig {

	@Bean
	public Principle getPrinciple() {
		
		return new Principle();
	}
	

	@Bean
	public College getCollege() {
		
		return new College(getPrinciple());
	}
	
}

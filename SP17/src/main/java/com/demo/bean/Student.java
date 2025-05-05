package com.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("kumar")
	private String name;
	private String city;
	
	
	public void study() {
		System.out.println("student studying");
	}

}

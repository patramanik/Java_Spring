package com.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studemt1")
public class Student {
	
	@Value("abcd")
	private String name;
	@Value("Pune")
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	

}

package com.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private List<String> address;
	private Set<String> phone;
	private Map<String, String> marks;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, List<String> address, Set<String> phone, Map<String, String> marks) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", marks=" + marks + "]";
	}
	
	
	
	
	
}

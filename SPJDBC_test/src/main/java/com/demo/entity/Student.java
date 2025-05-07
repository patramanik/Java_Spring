package com.demo.entity;

public class Student {
	
	private Internship internship;
	
	public Student(Internship internship) {
		this.internship = internship;
	}
	
	
	public void studentInfo() {
		
		internship.internshipInfo();
		System.out.println("From student info");
	}

}

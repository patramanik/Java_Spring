package com.demo.entity;

public class College {
	
	private Principle principle;
	
	public College(Principle principle) {
		this.principle = principle;
	}
	
	public void collegeInfo() {
		
		principle.principleInfo();
		System.out.println("My college Info");
	}
	

}

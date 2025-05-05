package com.demo.entity;

public class Student {
	
	private Laptop laptop;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( Laptop laptop) {
		super();
		this.laptop = laptop;
	}

	

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [laptop=" + laptop + "]";
	}
	
	
	

}

package com.demo.entity;

public class Laptop {
	
	private String name;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + "]";
	}
	
	

}

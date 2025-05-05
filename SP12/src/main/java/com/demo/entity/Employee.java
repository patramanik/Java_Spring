package com.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	// we can mansion @Autowired on setter,constructor,attributed any of them
	
	//@Autowired
	
	Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}

	@Autowired    
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
}

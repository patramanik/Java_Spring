package com.demo.entity;

public class Person {
	
	private int pid;
	private String pname;
	
	Certificate certi;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, Certificate certi) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.certi = certi;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", certi=" + certi + "]";
	}
	

}

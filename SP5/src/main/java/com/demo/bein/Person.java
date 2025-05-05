package com.demo.bein;

public class Person {
	private int pid;
	private String pname;
	private String psalary;
	
	
	public Person(int pid, String pname, String psalary) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.psalary = psalary;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", psalary=" + psalary + "]";
	}
	
	

}

package com.demo.entity;

public class Addittaon {
	
	private int x;
	
	private int y;

	public Addittaon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Addittaon(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Addittaon(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	
	public void doSum() {
		System.out.println(x+y);
	}

	

}

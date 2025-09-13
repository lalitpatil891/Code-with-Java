package com.nit.first_complete_oop;

public class Dog {
	private String dogName;
	private int dogAge;
	private double dogHeight;
	
	public Dog(String dogName, int dogAge , double dogHeight) {
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogHeight = dogHeight;
	}
	
	public String toString() {
		
		return "Dog [ dogName "+dogName + " dogAge " +dogAge+ " dogHeight " +dogHeight+ "]";   
	}
}


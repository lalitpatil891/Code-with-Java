package com.nit.scenario_based_program;

public class Customer {
	
	private String customerName;
	private int creditPoints;
	
	public Customer(String customerName, int creditPoints) {
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}
	
	public int getCreditPoints()
	{
		return creditPoints;
	}
	
	@Override 
	public String toString() {
		return customerName;
	}
}

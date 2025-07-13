//DEEP COPY

package com.nit.deep_copy;

public class Customer {
	
	private double customerBill;
	
	public Customer() {
		customerBill = 0.0;
	}
	
	public Customer(double customerBill) {
		super();
		this.customerBill = customerBill;
	}
	
	@Override
	public String toString()
	{
		return "Customer [ CustomerBill= "+customerBill+ " ]";
	}
	
	public double getCustomerBill() {
		return customerBill;
	}
	
	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}
}

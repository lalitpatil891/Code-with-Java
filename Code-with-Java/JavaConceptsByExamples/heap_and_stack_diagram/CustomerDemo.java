package com.nit.heap_and_stack_diagram;

public class CustomerDemo {

	public static void main(String[] args) {
		
		int val = 100;
		
		Customer c = new Customer("Ravi", 2);
		
		m1(c);
		
		//GC [Only one Object 3000x eligible for GC]
		
		System.out.println(c.getId());
	}
	
	public static void m1(Customer cust)
	{
		cust.setId(5);
		
		cust = new Customer("Rahul", 7);
	
		cust.setId(9);
		System.out.println(cust.getId());
	}

}

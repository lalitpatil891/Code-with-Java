//DEEP COPY

package com.nit.deep_copy;

public class DeepCopy {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(12000);   //c1 & c2 is reference Variable
		Customer c2 = new Customer();
		c2.setCustomerBill(c1.getCustomerBill());
		
		System.out.println("Before change...");
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setCustomerBill(15000);
		
		System.out.println("After Change...");
		
		System.out.println(c1);
		System.out.println(c2);
	}
}

/*
Output

Before change...
Customer [ CustomerBill= 12000.0 ]
Customer [ CustomerBill= 12000.0 ]
After Change...
Customer [ CustomerBill= 15000.0 ]
Customer [ CustomerBill= 12000.0 ]
*/

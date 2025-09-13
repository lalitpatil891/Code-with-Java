/*What is Data Hiding ?
----------------------
Data hiding is nothing but declaring our data members with private access modifier so our data will not be accessible from outer world that means no one can access our data directly from  outside of the class.

*We should provide the accessibility of our data through methods so we can perform VALIDATION ON DATA which are coming from outer world.*/

package com.nit.data_hiding;

public class BankApplication {

	public static void main(String[] args) {
		
		Customer raj = new Customer();
		raj.deposit(10000);
		raj.withdraw(5000);
		
		System.out.println(raj);  //calling toString() method of Customer class
	}

}

/*
Output

Balance after deposit is : 20000.0
Balance after withdraw is: 15000.0
*/

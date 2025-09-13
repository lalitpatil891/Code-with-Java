/*What is Data Hiding ?
----------------------
Data hiding is nothing but declaring our data members with private access modifier so our data will not be accessible from outer world that means no one can access our data directly from  outside of the class.

*We should provide the accessibility of our data through methods so we can perform VALIDATION ON DATA which are coming from outer world.*/
package com.nit.data_hiding;

public class Customer {
	
	@Override
	public String toString() {
		return "Customer [balance=" + balance + "]";
	}

	private double balance = 10000; //Data hiding
	
	public void deposit(double amount)
	{
		//data validation
		if(amount <= 0)
		{
			System.out.println("Amount can't be deposited.");
		}
		else
		{
			this.balance = this.balance + amount;
			System.out.println("Balance after deposit is : "+this.balance);
		}
	}
	
	public void withdraw(double amount)
	{
		if(this.balance < amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			this.balance =this.balance - amount;
			System.out.println("Balance after withdraw is: "+this.balance);
		}
	}
}

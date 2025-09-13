/*Whenever super class variable name and sub class variable name both are same then it is called variable Hiding, Here sub class variable hides super class variable.*/

package com.nit.variable_hiding;

class Father
{
	protected double balance = 50000;
}

class Son extends Father
{
	protected double balance = 18000;  //Variable Hiding
	
	public void showBalance()
	{
		System.out.println("Son Balance is: "+this.balance);  //18000
		
		System.out.println("Father Balance is: "+super.balance);  //50000
	}
	
}

public class VariableHidingDemo1 {

	public static void main(String[] args) {
		
		Son son =  new Son();
		son.showBalance();	
	}
}

/*
Method Hiding = It is only possible with static method.
Method Overriding = It is only possible with non-static method.
*/

package com.nit.final_keyword;

final class Test
{
	private int data = 100;
	
	public Test(int data)
	{
		this.data = data;
		System.out.println("Data value is : "+data);
	}
}

public class FinalClassExample1 {

	public static void main(String[] args) {
		Test t1 = new Test(300);
	}
}

/**
 * 
 * NOTE : For final class we can create object as well as we can modify the data.  
 * 
 * */

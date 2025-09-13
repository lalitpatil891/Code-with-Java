//Instance variable initialization Order 

package com.nit.initialization_order;

public class Test {
	
	private int x=100; //step 1
	
	{
		x= 200;   //Step 2
	}
	
	public Test()
	{
		super();
		x = 400;   //Step 3
	}
	
	public void accept()
	{
		x = 400;   //Step 4 [Not Recommended]
	}
	
	public int getX()
	{
		return this.x;
	}
}	

package com.nit.blank_final_field_demo;

class Test
{
	final int x;
	
	public void setData()
	{
		x = 200;
	}
}

public class BlankFinalFieldDemo2 {

	public static void main(String[] args) {
		
		Test t1 = new Test();
	}

}


//Note : can't initialized inside a method.
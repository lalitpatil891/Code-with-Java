package com.nit.blank_final_field_demo;

class Hello
{
	final int x;
	
	public Hello()
	{
		System.out.println(x);
	}
	
	public Hello(int y)
	{
		System.out.println("Y is:"+y);
	}
	
	{
		x = 100;
	}
}

public class BlankFinalFieldDemo6 {

	public static void main(String[] args) {
		
		Hello h1 = new Hello();
		Hello h2 = new Hello(1);
	}

}

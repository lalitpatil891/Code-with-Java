package com.nit.static_block_demo;

class Samplee
{
	static
	{
		System.out.println("Satic Block");
		x = m1();  //100
		System.out.println(Samplee.x);  //100
	}
	
	public static int m1()
	{
		System.out.println("Satic Method");
		return 100;
	}
	
	static int x;
}

public class StaticBlockDemo10 {

	public static void main(String[] args) {
		
		System.out.println(Samplee.x);  //100
	}
}

/*
Satic Block
Satic Method
100
100
*/
/**Q 11. Example on execution order of static members in same class?*/
package com.nit.Assignment_8;

public class Test11 {
	
	static int x = 10;
	static int y = 20;
	
	static {   // first call static
		System.out.println("---Test11 SB1 clalled---");
		System.out.println("X : "+x);
		System.out.println("y : "+y);
	}
	
	static void m1()  //third called method m1
	{
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
	public static void main(String[] args) {
		m1(); //called method after satic block
	}
	
	static {  //second called static
		System.out.println("---Test11 SB2 called---");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}

/*
---Test11 SB1 called---
X : 10
y : 20
---Test11 SB2 called---
x : 10
y : 20
X : 10
Y : 20
*/

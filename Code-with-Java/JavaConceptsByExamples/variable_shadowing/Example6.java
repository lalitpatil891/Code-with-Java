package com.nit.variable_shadowing;

public class Example6 {

	int x;
	int y;
	
	public void m1(Example6 e){
		
		System.out.println("x= "+e.x+ ", y= " +e.y);
	}
		
	public static void main(String[] args) {
		
		
		Example6 e1 = new Example6();
		
		e1.x = 20;
		e1.y = 30;
		//e1.m1(e1);
		
		Example6 e2 = new Example6();
		e2.x = 12;
		e2.y = 12;
		
		e1.m1(e2);
		System.out.println(e1.x+ "," +e1.y);
		System.out.println(e2.x+ "," +e2.y);

	}
}

/*
Concepts Used in the Program
1️⃣ Classes and Objects (OOP)
Example6 is a class, and e1 & e2 are its objects (instances).
Each object has its own copy of instance variables x and y.
2️⃣ Instance Variables
int x; and int y; are instance variables stored in the heap memory.
Each object (e1, e2) has a separate copy of these variables.
3️⃣ Methods and Method Calls
m1(Example6 e) is a non-static method, meaning it operates on objects.
It takes an object reference as a parameter (e) and prints x and y values from that object.
4️⃣ Passing Objects as Parameters
e1.m1(e2); passes e2 as an argument to m1().
Inside m1(), e refers to e2, so e.x and e.y print 12, 12.
5️⃣ Reference Variables and Memory Allocation
e1 and e2 are reference variables storing addresses of heap-allocated objects.
The method m1() accesses the object properties using reference e.
6️⃣ Heap and Stack Memory
e1 and e2 are stored in the heap memory.
The method call (m1(e2)) and local variable e exist in the stack memory.

*/

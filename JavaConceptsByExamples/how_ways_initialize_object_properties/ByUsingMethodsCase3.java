//3) By using methods :
// A) First Approach (Method without Parameter)

package com.nit.how_ways_initialize_object_properties;

class Case3A {
	int x,y;
	
	public void setData()
	{
		x = 100; 
		y = 200;
	}
}

public class ByUsingMethodsCase3 {

	public static void main(String[] args) {
		
		Case3A c1 = new Case3A();
		c1.setData();
		System.out.println(c1.x);
		
		Case3A c2 = new Case3A();
		c2.setData();
		System.out.println(c2.y);
	}
}

/* 
Here also, all the objects will be iniatilized with same value.
*/ 
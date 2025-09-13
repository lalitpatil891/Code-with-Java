/* 4) By using Constructor 
     
     d) By using instance block (Instance Initializer)
	 -------------------------------------------------*/

package com.nit.how_ways_initialize_object_properties;

class Test3 {
	int x, y;

	public Test3() {
		System.out.println(x);
		System.out.println(y);
	}

	// Instance block
	{
		x = 100;
		y = 200;
	}
}

public class ByUsingConstructorCase4Approch4 {

	public static void main(String[] args) {

		 new Test3();
	}
}

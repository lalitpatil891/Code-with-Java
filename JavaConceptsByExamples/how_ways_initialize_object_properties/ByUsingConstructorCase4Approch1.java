/*4) By using Constructor 

   A) First Approach (No Argument Constructor)
   --------------------------------------------*/

package com.nit.how_ways_initialize_object_properties;

class Test1 {
	int x, y;

	public Test1() // All the objects will be Initialized with same value
	{
		x = 10;
		y = 20;
	}

	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}

}

public class ByUsingConstructorCase4Approch1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println(t1.toString());

		Test1 t2 = new Test1();
		System.out.println(t2.toString());
	}

}

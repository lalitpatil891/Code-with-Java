/* 4) By using Constructor 
		B) Second Approach (Parameterized Constructor)
    	-----------------------------------------------
*/

package com.nit.how_ways_initialize_object_properties;

class Test2 {
	int x, y;

	public Test2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Test2 [x=" + x + ", y=" + y + "]";
	}

}

public class ByUsingConstructorCase4Approch2 {

	public static void main(String[] args) {

		Test2 t1 = new Test2(12, 78);
		System.out.println(t1.toString());

		Test2 t2 = new Test2(15, 29);
		System.out.println(t2.toString());
	}

}

/*
    This is the best way to initialize our instance variable because variable initialization and variable re-initialization both will be done in the same line as well as all the objects will be initialized with different values. 
*/

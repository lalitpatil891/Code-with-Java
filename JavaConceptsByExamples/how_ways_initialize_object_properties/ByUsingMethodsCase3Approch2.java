/*  3) By using methods :
 		B) Second Approach (Method with Parameter)
    	-------------------------------------------
*/

package com.nit.how_ways_initialize_object_properties;

class Case3B {
	int x, y;

	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Case3B [x=" + x + ", y=" + y + "]";
	}

}

public class ByUsingMethodsCase3Approch2 {

	public static void main(String[] args) {

		Case3B t1 = new Case3B();
		t1.setData(12, 78);

		System.out.println(t1.toString());

		Case3B t2 = new Case3B();
		t2.setData(15, 80);
		System.out.println(t2.toString());

	}
}

/*
  Here the Drawback is initialization and re-initialization both are done in two different lines so Constructor introduced.
 */
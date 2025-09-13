//2) By using Object Reference :

package com.nit.how_ways_initialize_object_properties;

class Case2 {
	int x, y;

}

public class ByUsingObjectReferenceCase2 {

	public static void main(String[] args) {

		Case2 c1 = new Case2();
		c1.x = 10;
		System.out.println(c1.x);

		Case2 c2 = new Case2();
		c2.y = 20;
		System.out.println(c2.y);

	}
}

/* Here we are getting different values with respect to object but here the program becomes more complex.*/
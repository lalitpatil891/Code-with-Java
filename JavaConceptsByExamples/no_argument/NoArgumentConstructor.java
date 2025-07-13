/*No Argument OR Parameter-less OR Non parameterized OR Zero
   argument Constructor.*/
package com.nit.no_argument;

public class NoArgumentConstructor {

	public static void main(String[] args) {
		
		Person scott = new Person();
		System.out.println(scott);
		
		System.out.println("---------------------------------");
		
		Person smith = new Person();
		System.out.println(smith);
		
		
	}
}

/*
Output


Person [personId = 111, PersonName = lalit ]
---------------------------------
Person [personId = 111, PersonName = lalit ]


In the above program smith and scott both objects are initialized with same data so not a recommened way.

*/

/*No Argument OR Parameter-less OR Non parameterized OR Zero
   argument Constructor.*/

package com.nit.no_argument;

public class Person {
	
	private int personId;
	private String personName;
	
	public Person()
	{
		personId = 111;
		personName = "lalit";
	}
	
	@Override
	public String toString() {
		return "Person [personId = "+personId+ ", PersonName = "+personName+" ]";
	}
}


/*
Output


Person [personId = 111, PersonName = lalit ]
---------------------------------
Person [personId = 111, PersonName = lalit ]


In the above program smith and scott both objects are initialized with same data so not a recommened way.

*/

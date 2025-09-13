/* Role of static field in Object creation :
-----------------------------------------
Whenever we create an object then a single copy of static filed is created and the same single copy is sharable by all the objects so, if we make any changes through one object, it will reflect to all the objects as shown in the program.
*/

package com.nit.oop_2;

public class Demo {
	static int x = 100; // 102

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();

		++d1.x;
		++d2.x;

		System.out.println(d1.x);
		System.out.println(d2.x);

	}

}


//output : 102 102

/*
So the Conclusion is :

Instance Variable = Multiple Copies with each ane every Object
Static Variable = Single Copy for all the objects.
*/
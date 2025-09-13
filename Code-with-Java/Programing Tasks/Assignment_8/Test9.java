/**What is the output of the below program ?*/

package com.nit.Assignment_8;

public class Test9 {

	static void m1() {
		System.out.println("Test9 : m1()");
	}
	
	static void m2() {
		System.out.println("Test9 : m2()");
	}
	
	public static void main(String[] args) {
		m1();
		m2();
	}
}
/*
+---------------------+
|   Program Start     |
+---------------------+
         |
         v
+-------------------+
|   Enter main()    |
+-------------------+
         |
         v
+-------------------+
|    Call m1()      |
+-------------------+
         |
         v
+-----------------------+
| Execute m1()      	|
| Print "Test9 : m1()" 	|
+-----------------------+
         |
         v
+-------------------+
| Return to main()  |
+-------------------+
         |
         v
+-------------------+
| Call m2()         |
+-------------------+
         |
         v
+-----------------------+
| Execute m2()      	|
| Print "Test9 : m2()" 	|
+-----------------------+
         |
         v
+-------------------+
| Return to main()  |
+-------------------+
         |
         v
+-------------------+
|  Program End      |
+-------------------+
*/
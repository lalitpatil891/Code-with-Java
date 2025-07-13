/*Note : If a class contains more than 1 static block then it will be executed from top to bottom.*/

package com.nit.static_block_demo;

class Test
{
	static int x;
	
	static 
	{
		x = 100;
		System.out.println("x value is: "+x);
	}
	
	static
	{
		x = 200;
		System.out.println("x value is: "+x);
	}
	
	static
	{
		x = 300;
		System.out.println("x value is: "+x);
	}
}

public class StaticBlockDemo1 {

	public static void main(String[] args) {
			
		System.out.println("Main method");
		System.out.println(Test.x);
	}

}

/*Output

Main method
x value is: 100
x value is: 200
x value is: 300
300
*/



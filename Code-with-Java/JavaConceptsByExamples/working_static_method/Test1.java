/*Working with Static method with different return type
 * 
 * If a static method is defined inside the ELC class then we can directly call the static method from the main method, class is not required.
 */

package com.nit.working_static_method;

public class Test1 {

	public static void main(String[] args) {
		
		square(5);
		
	}
	
	public static void square(int x)
	{
		System.out.println("Square is: "+(x*x));
	}

}


//Output : Square is: 25
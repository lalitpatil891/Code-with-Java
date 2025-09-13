/**
 * Is @Override Mandatory in Java?
 * No, @Override is not mandatory in Java, but it is highly recommended.
 * 
 * What Happens If You Don’t Use @Override?
 * 
 * The code will still work if the method is correctly overridden.
 * But if there’s a mistake (e.g., a typo in the method name),
 * Java won't show an error—it will just treat it as a new method instead of overriding.
 */

package com.nit.method_overriding;

interface Vehicle {
	
	void start(); //Abstract method (implicitly public and Abstract)
}

//Implementing class
class Car implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Car is Starting...");
	}
}

//Main class
public class InterfaceOverride {

	public static void main(String[] args) {
		
		Vehicle myCar = new Car();  //Upcating
		
		myCar.start();
	}

}


/**Why Use @Override?
✅ Prevents mistakes (e.g., typos in method names)
✅ Improves readability (easier to understand code)
✅ Ensures method signatures match the parent class

*/
/*Single Inheritance Example

When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.*/

package com.nit.inheritance;

class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void Bark() {
		System.out.println("Barking...");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.Bark();
		d.eat();
	}

}

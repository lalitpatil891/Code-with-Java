package com.nit.castingUpOrDown;

class Animal {

	public void makeSound() {
		System.out.println("The Animal Makes Sound..!");
	}
}

class Dog extends Animal {

	public void bark() {
		System.out.println("Dog bark.. Woaf!");
	}

}

public class DownCastingExample {

	public static void main(String[] args) {

		Animal myAnimal = new Dog(); // upcasting----- Dog -> Animal
		myAnimal.makeSound();

		Dog myDog = (Dog) myAnimal; // Explicit casting (Safe in this case)
		myDog.bark();

	}

}

/**Upcasting and Downcasting in Java
Casting in Java is the process of converting one object reference to another type.

Upcasting (Widening): Converting a subclass object to a superclass reference.
Downcasting (Narrowing): Converting a superclass reference back to a subclass reference.
*/
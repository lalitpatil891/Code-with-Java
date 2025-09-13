package com.nit.method_overriding;

//Super Class
class Animal {
	void makeSound() { 	// Method to be overridden
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {

	@Override
	void makeSound() {	// Overriding the method
		System.out.println("Dog brarks: Woof! Woof!");
	}
}

class Cat extends Animal {

	@Override
	void makeSound() {
		System.out.println("Cat Meow Meow..!");
	}	
}

//Main class
public class MethodoveridingDemo2 {

	public static void main(String[] args) {
		
		Animal myAnimal = new Dog();
		myAnimal.makeSound();

		Animal myAnimal2 = new Cat();
		myAnimal2.makeSound();
	}
}
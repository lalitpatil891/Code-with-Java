/** Using an Interface */

package com.nit.interfaces_w3school_examples;

interface Animall {
    void makeSound(); // Abstract method
}

class Dog implements Animall {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animall {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

		 	Animall myDog = new Dog(); // Interface reference to a Dog object
	        myDog.makeSound(); // Output: Dog barks

	        Animall myCat = new Cat(); // Interface reference to a Cat object
	        myCat.makeSound(); // Output: Cat meows
	}

}

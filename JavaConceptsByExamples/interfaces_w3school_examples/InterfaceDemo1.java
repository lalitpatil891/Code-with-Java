package com.nit.interfaces_w3school_examples;

interface Animal {
	public void animalSound();  //interface method(Does not have a body)
	public void sleep();	//interface method(Does not have a body)
}
//Pig "implements" the Animal interface

class Pig implements Animal {
	public void animalSound() {

		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		
		//The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		
		Pig myPig = new Pig();  //Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}

/*OUTPUT

The pig says: wee wee
Zzz


*/	

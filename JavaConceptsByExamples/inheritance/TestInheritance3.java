package com.nit.inheritance;

class Animal3 {
	void eat() {
		System.out.println("eating...");
	}
}

class TomCat extends Animal3 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal3 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class TestInheritance3 {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.meow();
		c.eat();
		
		System.out.println("----------------");
		TomCat tc = new TomCat();
		
		tc.bark();
		tc.eat();
		// c.bark(); //C.T.Errot
	}
}

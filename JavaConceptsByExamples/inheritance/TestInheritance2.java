/*Multilevel Inheritance Example

When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.*/

package com.nit.inheritance;

class Animal2
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Tiger extends Animal2
{
	void bark()
	{
		System.out.println("Barking...");	
	}	
}

class BabyTiger extends Tiger
{
	void weep()
	{
		System.out.println("Weeping....");
	}
}


public class TestInheritance2 {

	public static void main(String[] args) {
			
		Tiger t = new Tiger();
	
		t.eat();
		t.bark();
		
		System.out.println("-----------------");
		BabyTiger bt = new BabyTiger();
		bt.eat();
		bt.weep();
		bt.bark();
	}

}

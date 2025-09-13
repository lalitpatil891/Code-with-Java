/*
Case 2 :
--------
super("NIT") : It must be written by user. It is used to call 
               parameterized constructor of super class.
*/
package com.nit.constructor_chaining;

class Animal
{
	protected String name;
	
	public Animal(String name)
	{
		super();
		this.name = name;
	}
}

class Dog extends Animal
{
	public Dog(String dogName)
	{
		super(dogName);
	}
	
	public String getDogName()
	{
		return this.name;
	}
}

class Tiger extends Animal
{
	public Tiger(String tigerName)
	{
		super(tigerName);
	}
	
	public String getTigerName()
	{
		return this.name;
	}
}

public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		
		Dog tommy = new Dog("Tommy");
		System.out.println("Dog Name is :"+ tommy.getDogName());
		
		Tiger tiger = new Tiger("Singham");
		System.out.println("Tiger name is: "+tiger.getTigerName());
	}
}

/*
Dog Name is :Tommy
Tiger name is: Singham
*/

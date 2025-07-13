//Program on single level inheritance 

package com.nit.inheritance_demo;

class Father
{
	public void house()
	{
		System.out.println("3BHK house");
	}
}

class Son extends Father
{
	public void car()
	{
		System.out.println("Audi Car");
	}
}

public class InheritanceDemo
{
	public static void main(String[] args) {
		
		Son son = new Son();
		
		son.car();         // son both access
		son.house();
		
		System.out.println("--------------------");
		Father father = new Father();  //Father only house alows
		 
		father.house(); 
		//father.car();  //Father cannot access by car
		 
		
		
		
	}
}



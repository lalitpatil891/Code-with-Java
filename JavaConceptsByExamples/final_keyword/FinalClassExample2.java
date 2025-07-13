package com.nit.final_keyword;

/**
	Whenever we declare a constructor as private then we should declare the class with final modifier. If constructor is private then we can't create a sub class because super class constructor is not visible from sub class Constructor.
 */


final class Sample
{
	private Sample()  //Constructor is private so declare the class with final modifier
	{
		System.out.println("Private Constructor");
	}
	
}

public class FinalClassExample2 {

	public static void main(String[] args) {
		Sample s = new Sample();
	}

}

/*ERROR :Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor Sample() is not visible

	at OopProgram/com.nit.final_keyword.FinalClassExample2.main(FinalClassExample2.java:20)*/

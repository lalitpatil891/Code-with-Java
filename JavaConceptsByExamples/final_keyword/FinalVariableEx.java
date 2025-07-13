package com.nit.final_keyword;

class A
{
	final int A = 10; // re-assignment is not possible
	public void setData()
	{
		A = 10; //error
	
		System.out.println("A value is : "+A);
	}
}

public class FinalVariableEx {

	public static void main(String[] args) {
		
		final A a1 = new A();
		a1.setData();
		
		a1 = new A(); //error
		a1.setData();
	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final local variable a1 cannot be assigned. It must be blank and not using a compound assignment

	at OopProgram/com.nit.final_keyword.FinalVariableEx.main(FinalVariableEx.java:21)
*/

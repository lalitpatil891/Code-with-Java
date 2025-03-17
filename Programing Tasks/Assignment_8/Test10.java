/** What is the output of the below program ?*/

package com.nit.Assignment_8;

public class Test10 {

	static 
	{
		System.out.println("SB1");
	}
	
	static void m1()
	{
		System.out.println("M1()");
	}
	
	public static void main(String[] args) {
		
		Test10.m1();
	}
}

/*Execution Flow (Small Diagram)
Start

The JVM loads the Test10 class.
Static Block Execution

The static block is executed during class loading.
It prints SB1.
Enter main()

The main() method begins execution.
Call m1()

The main() method calls the static method m1().
m1() prints m1().
End

The main() method completes execution, and the program terminates.*/

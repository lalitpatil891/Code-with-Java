/**Q 14 . What is the  output below program ? */

package com.nit.Assignment_8;

public class Test14 {
	static int x =100;
	static {
		System.out.println("x :"+x);
		System.exit(0);
	}
}

/* public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

*
*The static block executes when the class is loaded by the JVM, even before the main method is invoked.
System.exit(0) causes the JVM to terminate the program cleanly without executing any further code.*/
package com.nit.lambda;

interface Calculator {
	int add (int a, int b);   //Sigle Abstract Method
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		//Lambda Expression to implement the 'add' method
		
		Calculator calc = (a,b) -> a + b;
		
		System.out.println("Sum: "+calc.add(10, 20));  //Output: Sum: 30
	}
}


/**

Flow Explanation of the Code

1. Interface Definition:
------------------------

@FunctionalInterface
interface Calculator {
    int add(int a, int b);  // Single abstract method
}
Functional Interface: The Calculator interface is annotated with @FunctionalInterface, which ensures that it contains exactly one abstract method (add).

Abstract Method: The add method defines the contract for the functionality but does not provide an implementation. Any class or lambda expression implementing Calculator must define this method.

2. Main Class:
--------------

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        ...
    }
}
This is the entry point of the program where the execution starts.

3. Lambda Expression:
---------------------

Calculator calc = (a, b) -> a + b;
Lambda Expression: The lambda expression (a, b) -> a + b is used to implement the add method of the Calculator interface.
(a, b): Parameters of the add method.
a + b: Implementation of the method, which returns the sum of a and b.

Interface Instantiation: The lambda expression effectively creates an instance of the Calculator interface and provides the implementation of the add method.
Internally, it behaves like an anonymous class with a single abstract method.

4. Method Invocation:
---------------------

System.out.println("Sum: " + calc.add(10, 20));
Calling the add Method:
The add method is invoked on the calc object created by the lambda expression.
It passes the arguments 10 and 20 to the lambda expression.
Execution of Lambda: The lambda body (a, b) -> a + b computes the sum of 10 and 20, returning 30.


5. Output Display :
-------------------
The result returned by the add method (30) is concatenated with the string "Sum: " and printed to the console.

Execution Flow Summary: The Calculator functional interface is defined with a single abstract method add.
In the main method, a lambda expression implements the add method, which takes two integers and returns their sum.
The calc object is created, representing the implementation of the Calculator interface using the lambda expression.
The add method is invoked with arguments 10 and 20, and the lambda expression calculates their sum.
The result (30) is printed as
*/
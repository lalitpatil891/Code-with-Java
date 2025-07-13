/**What is Lambda Expression in java ?
------------------------------------
It is a new feature introduced in java from JDK 1.8 onwards.
It is an anonymous function i.e function without any name.
In java it is used to enable functional programming.
It is used to concise our code as well as we can remove boilerplate code.
Lambda will work only with functional interface.
If the body of the Lambda Expression contains only one statement then curly braces are optional.
We can also remove the variables type while defining the Lambda Expression parameter.
If the lambda expression method contains only one parameter then we can remove () symbol also.
In lambda expression return keyword is optional but if we use return keyword then {} are compulsory.
Independently Lamda Expression is not a statement.
It requires a target variable i.e functional interface reference only.
Lamda target can't be class or abstract class, it will work with functional interface only. */

package com.nit.lambda;

interface Vehicle {

	void run(); //Single Abstract Method (SAM)
}

public class LambdaDemo1 {

	public static void main(String[] args) {

		Vehicle bike = () -> System.out.println("Bike is Running");
		bike.run();
		
		Vehicle car = () -> System.out.println("Car is Running");
		car.run();

		Vehicle bus = () -> System.out.println("Bus is Runnig");
		bus.run();
	}
}

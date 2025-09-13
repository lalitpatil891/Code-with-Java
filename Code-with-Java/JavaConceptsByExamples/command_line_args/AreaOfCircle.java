//WAP to find out area of Circle by using Command Line Argument

package com.nit.command_line_args;

public class AreaOfCircle {
	
	public static void main(String[] args)
	{
		final double PI = 3.14;
		
		double radius = Double.parseDouble(args[0]);
		
		double areaOfCircle = PI * radius * radius;
		
		System.out.println("Area of Circle is :" +areaOfCircle);
	}
}


/* 

Steps to execute the commad Line Argument Program using Eclipse IDE

Right Click on the Program -> Run As -> Run configuration -> Check Your main class name -> select Argument tab -> Pass the approprite value -> Run

*/
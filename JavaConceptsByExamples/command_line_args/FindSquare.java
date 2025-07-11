//WAP to find out the square of the number by using Commad Line Argument.

package com.nit.command_line_args;

public class FindSquare 
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		
		System.out.println("Square Of "+num+" is :"+(num*num));
	}
}


/* 

Steps to execute the commad Line Argument Program using Eclipse IDE

Right Click on the Program -> Run As -> Run configuration -> Check Your main class name -> select Argument tab -> Pass the approprite value -> Run

*/
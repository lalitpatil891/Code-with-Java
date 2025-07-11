//WAP to read a character [M/F] from command line argument.

package com.nit.command_line_args;

public class ReadCharacter {

	public static void main(String[] args)
	{
		char gender = args[0].charAt(0);
		
		System.out.println("Your Gender is : "+gender);
	}
}



/* 

Steps to execute the commad Line Argument Program using Eclipse IDE

Right Click on the Program -> Run As -> Run configuration -> Check Your main class name -> select Argument tab -> Pass the approprite value -> Run

*/
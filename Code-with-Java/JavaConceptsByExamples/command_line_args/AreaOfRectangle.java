//WAP to find out the area of rectangle

package com.nit.command_line_args;

public class AreaOfRectangle {

		public static void main(String[] args)
		{
			int length = Integer.parseInt(args[0]);
			int breadth = Integer.parseInt(args[1]);
			
			int areaOfRect = length * breadth;
			
			System.out.println("Area Of Rectangle is : "+areaOfRect);
			
		}
}


/* 

Steps to execute the commad Line Argument Program using Eclipse IDE

Right Click on the Program -> Run As -> Run configuration -> Check Your main class name -> select Argument tab -> Pass the approprite value -> Run

*/
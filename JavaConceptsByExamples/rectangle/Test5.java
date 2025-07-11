package com.nit.rectangle;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		double lenght = sc.nextDouble();
		
		System.out.print("Enter Breadth: ");
		double breadth = sc.nextDouble();
		
		double result = Rectangle.getAreaOfRectangle(lenght, breadth);

		System.out.println("Area of Rectangle is :"+result);
	}

}

/*
output

Enter Length: 9
Enter Breadth: 3
Area of Rectangle is :27.0
*/
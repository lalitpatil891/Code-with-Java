package com.nit.hierarchical_inheritance;

import java.util.Scanner;

public class HierarchicalDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of Radius: ");
		int radius = sc.nextInt();

		Circle circle = new Circle(radius);
		System.out.println(circle);

		System.out.println("Enter the length of the Rect: ");
		int length = sc.nextInt();

		System.out.println("Enter the breadth of the Rect: ");
		int breadth = sc.nextInt();

		Rectangle rect = new Rectangle(length, breadth);
		System.out.println(rect);

		sc.close();

	}
}

/*
+-------------------------------------------+
| Start                                     |
+-------------------------------------------+
| User Input -> Radius                      |
|   Circle Constructor                      |
|     -> Shape Constructor (val = radius)   |
|     -> Print "val value is: 5"            |
|   Circle toString -> Area = 78.5          |
|   Print "78.5"                            |
+-------------------------------------------+
| User Input -> Length & Breadth            |
|   Rectangle Constructor                   |
|     -> Shape Constructor (val = length)   |
|     -> Print "val value is: 10"           |
|     -> breadth = 4                        |
|   Rectangle toString -> Area = 40.0       |
|   Print "40.0"                            |
+-------------------------------------------+
| End                                       |
+-------------------------------------------+
*/

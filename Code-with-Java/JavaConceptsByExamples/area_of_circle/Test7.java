package com.nit.area_of_circle;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius :" );
		double radius = sc.nextDouble();
		
		String areaOfCircle = Circle.getAreaOfCircle(radius);
		
		double area = Double.parseDouble(areaOfCircle);
		
		System.out.println("Area of Circle is: "+area);
		sc.close();
	}

}

/*
 
Output

Enter radius :5
Area of Circle is: 78.5

*/
/** 
 *  Create a class Rectangle with attribute length and width
 *  add method calculate area and parameter of the rectangle
 *  Create an obj of the rectangle class and call this methods
 */

package com.nit.mayurTasks;

class Rectangle {
	public double width;
	public double height;

	public Rectangle() {
	}

	public double calculateArea(double width, double length) {
		return width * length;
	} 
}

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
	
		System.out.println("Area Of Rectangle is: " + rectangle.calculateArea(5, 8));
	}
}

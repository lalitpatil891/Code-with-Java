/** Assignment (17-DEC) ||  Question-1 */

package com.nit.assignment_17_dec;

class Shape {

	public Shape() { // no Argument Constructor
	}

	public void draw() {
		System.out.println("Shape draw");
	}

	public void erase() {
		System.out.println("Shape erase");
	}

	public static Shape randShape() {
		int randomValue = (int) (Math.random() * 3);
		switch (randomValue) {
		case 0:
			return new Circle();

		case 1:
			return new Square();

		case 2:
			return new Tringle();

		default:
			System.out.println("Default Case");
			return new Shape();
		}
	}

}

/** Circle Sub Class */
class Circle extends Shape {
	public Circle() { // no Argument Constructor

	}

	@Override
	public void draw() {
		System.out.println("Shape Draw");
	}

	@Override
	public void erase() {
		System.out.println("Shape Erase");
	}
}

/** Tringle Sub Class */
class Tringle extends Shape {
	public Tringle() { // no argument constructor

	}

	@Override
	public void draw() {
		System.out.println("Tringle Draw");
	}

	@Override
	public void erase() {
		System.out.println("Triangle Erase");
	}

}

/** Square Sub Class */
class Square extends Shape {

	public Square() { // No Argument Constructor

	}

	@Override
	public void draw() { // method
		System.out.println("Square Draw");
	}

	@Override
	public void erase() { // method
		System.out.println("Square Erase");
	}

}

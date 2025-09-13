//Program on single level inheritance 

package com.nit.inheritance_demo;

class Super {
	private int x;
	private int y;

	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Sub extends Super {
	public void getData() {
		System.out.println("x value is: " + getX());

		System.out.println("y value is: " + getY());
	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {

		Sub s1 = new Sub();
		s1.setData(100, 200);
		s1.getData();

	}

}


/*Note : Here with help of Encapsulation we can access private data of super class in sub class.*/
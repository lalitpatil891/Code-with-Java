package com.nit.how_ways_initialize_object_properties;

class Super {
	int x, y;

	public Super(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Sub extends Super {
	Sub() {
		super(100, 200); // Initializing the properties of super class

		System.out.println(x);
		System.out.println(y);
	}
}

public class ByUsingSuperKeyword {

	public static void main(String[] args) {
		new Sub();
	}
}

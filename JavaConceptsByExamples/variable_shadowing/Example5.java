package com.nit.variable_shadowing;

public class Example5 {

	int x;
	int y;

	public void m1() {
		System.out.println("x = " + this.x + ", y = " + this.y);   //x=40 y=50
		
		Example5 ex2 = new Example5();
		this.y = 15;
		this.x = 15;
	}

	public static void main(String[] args) {
		
		Example5 ex = new Example5();
		
		System.out.println("x = " + ex.x + ", y = " + ex.y);   //x=0 y=0
		
		ex.x = 40;
		ex.y = 50;
		
		ex.m1();
		
		System.out.println("x = " + ex.x + ", y = " + ex.y);	//x=15 y=15
	}
}

/*
OUTPUT

x = 0, y = 0
x = 40, y = 50
x = 15, y = 15

*/

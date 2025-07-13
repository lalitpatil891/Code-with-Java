package com.nit.variable_shadowing;

public class Example8 {

	int x;
	int y;
	
	public void m1() {
		System.out.println(this.x+" , " +this.y);
	}
	
	public static void main(String[] args) {

		Example8 e1 = new Example8();
		
		e1.x = 20;
		e1.y = 30;
		
		System.out.println(e1.x+" , "+e1.y);
		//e1.m1();
		e1 = new Example8();
		
		System.out.println(e1.x+" , "+e1.y);
		
		//If the object is refered by multiple reference variable then those reference variables are known as Object alias.
					
		
	}

}

package com.nit.static_block_demo;

class Static {

	public static void m1() {
		y = 200; // valid
		System.out.println(y); // valid
	}

	static int y;

}

public class StaticBlockDemo2 {

	public static void main(String[] args) {

		Static st = new Static();
		st.m1();
	}
}


/*If we directly perform direct read and write operation inside a static method then it is valid.
----------------------------------------------------------
//Static block
static 
{
   x = 100; //Valid
   System.out.println(x); //Invalid
   System.out.println(ClassName.x); //valid
}
static int x;
 */
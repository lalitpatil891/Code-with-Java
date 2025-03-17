/**Q 15 . What is the output of the below program ?*/
package com.nit.Assignment_8;

//Super Class
class Test15super {

	int x = 10;

	static void m1() {
		System.out.println("Test15Super : m1()");  //3
	}

	static {
		System.out.println("Test15Super : SB1 Called");   //1
	}
}


//sub class
class Test15 extends Test15super {
	static int x = 20;

	static {
		System.out.println("Test15Sub : SB2 called");  //2
	}

	static void m2() {
		m1();
		System.out.println("Test15Sub : m2()");  //4
	}

	public static void main(String[] args) {
		m2();
	}
}

/*
Test15Super : SB1 Called
Test15Sub : SB2 called
Test15Super : m1()
Test15Sub : m2()
*/

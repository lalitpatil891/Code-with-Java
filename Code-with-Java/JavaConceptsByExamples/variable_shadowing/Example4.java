package com.nit.variable_shadowing;

public class Example4 {

	int x;
	int y;

	public void add() {

		System.out.println("Sum is: " + (this.x + this.y));
	}

	public static void main(String[] args) {

		Example4 e1 = new Example4();
		Example4 e2 = new Example4();

		e1.x = 20;
		e1.y = 20;
		e1.add();

		System.out.println("----------------------------");

		e2.x = 30;
		e2.y = 40;
		e2.add();

	}

}


/**

Stack Memory (Method Calls & References)
----------------------------------------
| main()                               |
|   e1 → 1000x                         |
|   e2 → 2000x                         |
----------------------------------------

Heap Memory (Objects & Their Values)
----------------------------------------
| 1000x: Example04 Object               |
|   x = 30                              |
|   y = 40                              |
----------------------------------------
| 2000x: Example04 Object               |
|   x = 40                              |
|   y = 50                              |
----------------------------------------

*/
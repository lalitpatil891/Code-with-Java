/*Modifiers on Constructor :
---------------------------
Constructor can accept all types of access modifiers which are apllicable for accessibility level like private, default, protected and public.*/

package com.nit.overloading;

public class PrivateConstructor {
	private PrivateConstructor() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		new PrivateConstructor();

	}
}

/*Note : We can't apply static, final, abstract and synchronized modifier on constructor.*/

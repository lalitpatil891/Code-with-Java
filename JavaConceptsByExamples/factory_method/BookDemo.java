package com.nit.factory_method;

public class BookDemo {

	public static void main(String[] args) {
		
		Book object = Book.getBookObject();
		System.out.println(object);
	}
}

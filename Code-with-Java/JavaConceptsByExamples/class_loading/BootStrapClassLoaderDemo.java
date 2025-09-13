package com.nit.class_loading;

class Foo {

}

public class BootStrapClassLoaderDemo {

	public static void main(String[] args) {

		System.out.println(Foo.class.getClassLoader().getParent().getParent());

	}
}

/*Note :- Here we will get the output  as null because it is built in class loader for JVM which is used for internal purpose (loading only predefined .class file) so implementation is not provided hence we are getting null.*/
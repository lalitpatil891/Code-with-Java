/*//WAP that describes Application class loader is responsible to load our user-defined .class


java.lang.Class class has provided a predefined non static method called getClassLoader(), the return type of this method is ClassLoader class.[Factory Method]

This method will provide the class loader name which is responsible to load the .class file into JVM Memory.

public ClassLoader getClassLoader()*/ 

package com.nit.class_loading;

class Test
{
	
}

public class ApplicationClassLoaderDemo {

	public static void main(String[] args) {
	
		System.out.println("Test.class file is loaded by: ");
		
		System.out.println(Test.class.getClassLoader());

	}

}

package com.nit.class_loading;

class Demo
{
	
}

public class PlatformClassLoader {

	public static void main(String[] args) {
		
		System.out.println("Super Class of Application class Loader: ");
		
		System.out.println(Demo.class.getClassLoader().getParent());

	}

}

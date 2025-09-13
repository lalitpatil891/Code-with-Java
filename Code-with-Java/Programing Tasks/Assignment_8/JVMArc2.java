package com.nit.Assignment_8;

public class JVMArc2 {

	public static void main(String[] args) {
		
		System.out.println(JVMArc2.class.getClassLoader());
		System.out.println(JVMArc2.class.getClassLoader().getParent());
		
		System.out.println(JVMArc2.class.getClassLoader().getParent().getParent());
	}

}


/*

jdk.internal.loader.ClassLoaders$AppClassLoader@4f3f5b24
jdk.internal.loader.ClassLoaders$PlatformClassLoader@378fd1ac
null

*/
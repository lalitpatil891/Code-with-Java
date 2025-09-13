package com.nit.exception_handling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started!!!");
		
		try {
			int arr[] = {10,20,30};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index is out of limit!!!");
		}
		
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			System.out.println("ref variable is pointing to null");
		}
		
		System.out.println("Main method ended!!!");
	}
}

/*
OUTPUT

Main Method Started!!!
Array index is out of limit!!!
ref variable is pointing to null
Main method ended!!!

*/
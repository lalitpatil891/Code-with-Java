package com.nit.exception_handling;

class Foo
{
	
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try
		{
			throw new Foo();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

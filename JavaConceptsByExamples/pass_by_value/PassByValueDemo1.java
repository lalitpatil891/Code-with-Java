//Pass by Value

package com.nit.pass_by_value;

public class PassByValueDemo1 {

	public static void main(String[] args) {
		
		int x = 10;
		accept(x);
		System.out.println(x);
	}
	
	public static void accept(int y)
	{
		y = 100;
	}

}

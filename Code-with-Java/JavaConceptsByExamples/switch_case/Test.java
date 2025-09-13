package com.nit.switch_case;

public class Test {

	public static void main(String[] args) {
			
		long l = 12L;
		switch(l)   //error
		{
			case 12L : System.out.println("It is case 12");
						break;
		}
	}

}

/*
 * 
 *  NOTE : We can't pass long, float and double value. 
 * 
 */

package com.nit.switch_case;

public class Test4 {
	
	public static void main(String[] args)
	{
		case 128 : //Error
					System.out.println("It is case 127");
					break;
	}
}


/*
	NOTE : Value 128 is out of the range of byte and same applicable for short data type.
*/
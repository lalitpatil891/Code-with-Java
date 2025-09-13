package com.nit.blank_final_field_demo;

class LIC
{
	final double installment;  //Blank Final Field
}


public class BlankFinalFieldDemo1 {

	public static void main(String[] args) {
		
		LIC l = new LIC();
		
		System.out.println(l.installment);

	}

}


/* Note: A blank final field can't be initialized by default constructor.*/
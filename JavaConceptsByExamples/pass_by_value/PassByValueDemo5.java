package com.nit.pass_by_value;

public class PassByValueDemo5 {

	public static void main(String[] args) {
		
		String str = new String("Hyd");
		accept(str);
		
		System.out.println(str);  //Hyd
		
	}
	
	public static void accept(String s1) {
		s1 = "india";
	}

}


/*Note : Here String object will not be modified hence we will get the output Hyd because Strings are immutable.*/
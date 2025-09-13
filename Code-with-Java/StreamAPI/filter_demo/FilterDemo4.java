/**
 * 4) WAP to print all the names whose length is greater than 3 from string array
 * **/

package com.nit.filter_demo;

import java.util.*;

public class FilterDemo4 {

	public static void main(String [] args) {
		
	
	String [] names= {"Scott", "Raj", "Riya","Smith", "Stream", "Ram", "Ria"};
	
	System.out.println(Arrays.toString(names));
	
	Object []array = Arrays.stream(names).filter(str -> str.length() >3).toArray();
	
	System.out.println("All The names whose length > 3 : "+Arrays.toString(array));
	
	
	}	
}

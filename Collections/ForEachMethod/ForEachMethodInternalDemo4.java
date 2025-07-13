/**
 * Case 4 :
 * --------
*/

package com.nit.ForEachMethod;

public class ForEachMethodInternalDemo4 {

	public static void main(String[] args) 
	{
		   Vector<String> listOfCity = new Vector<>();	
	       listOfCity.add("Hyderabad");
	       listOfCity.add("Kolkata");
	       listOfCity.add("Pune");
	       listOfCity.add("Indore");
	       listOfCity.add("Mumbai");	       
	       
	       listOfCity.forEach(System.out::println);
	}
}

/**
 * Case 3 :
 * --------
*/

package com.nit.ForEachMethod;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo3 {

	public static void main(String[] args) 
	{
		   Vector<String> listOfCity = new Vector<>();	
	       listOfCity.add("Hyderabad");
	       listOfCity.add("Kolkata");
	       listOfCity.add("Pune");
	       listOfCity.add("Indore");
	       listOfCity.add("Mumbai");	       
	       
	       listOfCity.forEach(city -> System.out.println(city.toUpperCase()));
	}
}

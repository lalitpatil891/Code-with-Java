/**
Case 1:
---------
By using Anonymous inner class :
*/
package com.nit.ForEachMethod;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo1 {

	public static void main(String[] args) {
		
		Vector<String> listOfCity = new Vector<>();	
	       listOfCity.add("Hyderabad");
	       listOfCity.add("Kolkata");
	       listOfCity.add("Pune");
	       listOfCity.add("Indore");
	       listOfCity.add("Mumbai");
	       
	       //Anonymous inner class for Consumer<T>
	       Consumer<String> cons = new Consumer<String>() {
	    	   
	    	   @Override
	    	   public void accept(String city) {
	    		   System.out.println(city.toUpperCase());
	    	   }
	       };
	       
	       listOfCity.forEach(cons);	             
	}

}

/*we have 2 packages
 * 
 * com.nit.execution
 * com.nit.application
 */

package com.nit.execution;

/* This ELC class will import calculate.java from.ravi.application package as shown below */
import com.nit.application.*;

public class Elc {
	
	public static void main(String[] args)
	{
		//Importing and Using Calculate class
		Calculate.doSum(10, 10);
	}
}

//Sum is: 20
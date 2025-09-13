package com.nit.assignment_09_jan_mcq;

import java.io.FileNotFoundException;

public class a61
{
       public static void main(String[] argv)
       {
             try 
             {
                    throw new FileNotFoundException("");
             } 
			 catch (FileNotFoundException ex) 
              {
                    System.out.println("book list not found!");
                    throw ex;
              }
       }
}

/*  ERROR
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type FileNotFoundException

	at AllLabTasks/com.nit.assignment_09_jan_mcq.a61.main(a61.java:16)
*/

/**The main method does not declare throws FileNotFoundException, causing a compilation error.
Checked exceptions like FileNotFoundException must be handled or declared.*/
//ArrayList Program based on getting Index of First Occurrence of Element
package ArrayList;

import java.util.ArrayList;

public class ArrayList17 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(); 
		  al.add("ABC"); 
		  al.add("DEF"); 
		  al.add("ABC");  
		  al.add("GHI"); 
		  al.add(null); // null element is allowed in the ArrayList. 
		  System.out.println("Original ArrayList order:" +al); 

		// Call indexOf() method to get the index of the first occurrence of a specific element in the list. 
		  Integer indexofElement = al.indexOf("ABC"); // It will return the index of the first occurrence of the element. 
		  System.out.println("Index of the element ABC: " +indexofElement); 
		  
		  Integer indexElement = al.indexOf(null); 
		  System.out.println("Index of the element null: " +indexElement); 
		  Integer indexE = al.indexOf("JKL"); // It will return -1 if the element is not present in the list. 
		  System.out.println("Index of the element JKL: " +indexE); 
	}

}

/*
Original ArrayList order:[ABC, DEF, ABC, GHI, null]
Index of the element ABC: 0
Index of the element null: 4
Index of the element JKL: -1

*/

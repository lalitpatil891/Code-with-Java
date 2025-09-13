package ArrayList;

import java.util.ArrayList;

public class ArrayList18 {
	public static void main(String[] args) {
		ArrayList<Integer> arlist = new ArrayList<Integer>(); 
		  arlist.add(20); 
		  arlist.add(25); 
		  arlist.add(30); 
		  arlist.add(35); 
		  arlist.add(40); 
		  arlist.add(25); 
		  arlist.add(20); 
		  System.out.println("Original ArrayList Order: " +arlist); 

		  Integer lastindex = arlist.lastIndexOf(25); 
		  System.out.println("Index of last occurrence of the element 25: " +lastindex); 
		  Integer lindex = arlist.lastIndexOf(20); 
		  System.out.println("Index of the element 20: " +lindex ); 
	}
}
/*OUTPUT

Original ArrayList Order: [20, 25, 30, 35, 40, 25, 20]
Index of last occurrence of the element 25: 5
Index of the element 20: 6
*/
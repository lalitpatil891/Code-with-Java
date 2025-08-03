package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo6 {

	public static void main(String[] args) {
		
		Vector<Integer> listOfNumbers = new Vector<Integer>();
		
		listOfNumbers.add(500);
		listOfNumbers.add(900);
		listOfNumbers.add(400);
		listOfNumbers.add(300);
		listOfNumbers.add(800);
		listOfNumbers.add(200);
		listOfNumbers.add(100);
		listOfNumbers.add(600);
	
		
		System.out.print("Original Data: ");
		System.out.print(listOfNumbers);
		
		System.out.print("\nAscending Order: ");
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
		
		System.out.print("Descending Order: ");
		Collections.sort(listOfNumbers, Collections.reverseOrder());
		System.out.print(listOfNumbers);
		
		
		//Converting our vector(collection obj) into Array
		
		Object[] array = listOfNumbers.toArray();
		
//		for(Object arr : array) {
//			System.out.println(arr +" ");
//		}
		
		System.out.println("\nArray: "+Arrays.toString(array));	
	}
}

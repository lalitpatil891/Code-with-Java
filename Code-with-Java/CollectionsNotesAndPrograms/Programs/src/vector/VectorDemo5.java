//Sorting 

package vector;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {

	public static void main(String[] args) {
		
		Vector<String> listOfCity = new Vector<String>();
		
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmdabad");
		listOfCity.add("Varanasi");
		
		Collections.sort(listOfCity);
		
		listOfCity.forEach(System.out::println);
		
	}

}

/*
OUTPUT
 
Ahmdabad
Pune
Surat
Varanasi

 * */

//Program to merge and retain of two collection addAll()   retainlAll()
package ArrayList;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Ravi");
		al1.add("Rahul");
		al1.add("Rohit");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Pallavi");
		al2.add("Sweta");
		al2.add("Puja");
		
		al2.addAll(al1);
		
		System.out.println(al2); //[Pallavi, Sweta, Puja, Ravi, Rahul, Rohit]
//		---------------------------------
		
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Ravi");
		al3.add("Rahul");
		al3.add("Rohit");
		al3.add("Puja");
		
		

		ArrayList<String> al4 = new ArrayList<>();
		al4.add("Pallavi");
		al4.add("Sweta");
		al4.add("Puja");
		al4.add("Rahul");
		
		al3.retainAll(al4);
		
		System.out.println(al3);  //[Rahul, Puja]
		
	}

}

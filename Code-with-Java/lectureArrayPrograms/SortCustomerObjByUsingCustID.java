///Sort The Customer Object By using Cutomer id.

package logicalArray.lectureArrayPrograms;

import java.util.Arrays;

record Customerr(Integer id, String name) implements Comparable<Customerr> {

	@Override
	public int compareTo(Customerr otherId) {

		return this.id - otherId.id; // Simple and fast,Uses subtraction for comparison,Can cause integer overflow
		// return this.id.compareTo(otherId.id); //No overflow, safer,Uses built-in safe
		// comparison, Slightly more overhead
	}
}

public class SortCustomerObjByUsingCustID {

	public static void main(String[] args) {

		Customerr c1 = new Customerr(150, "Aajay");
		Customerr c2 = new Customerr(200, "Sham");
		Customerr c3 = new Customerr(101, "Raj");

		Customerr[] customers = new Customerr[] { c1, c2, c3 };

		Arrays.sort(customers);

		System.out.println("After Sorting Array...");
		
		for (Customerr cust : customers) {
			System.out.println(cust);
		}

	}

}


/*
OUTPUT
------ 
Customerr[id=101, name=Raj]
Customerr[id=150, name=Aajay]
Customerr[id=200, name=Sham]

*/
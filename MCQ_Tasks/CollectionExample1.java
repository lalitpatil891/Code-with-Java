/**
4.What is the output of the following code

A.	ArrayIndexOutofBoundException
B.	IndexOutOfBoundsException
C.	25 Naresh A
D.	NullPointerException */


import java.util.ArrayList;

public class CollectionExample1 {

	public static void main(String[] args) {

		// Creating an Empty arrayList of string
		ArrayList<String> al = new ArrayList<>();

		//adding Elements to the list

		al.add("25");		//list = [25]
		al.add("Naresh");	//list = [25, Naresh]
		al.add("A");		//list = [25, Naresh, A]
		al.add("37");		//list = [25, Naresh, A, 37]

		// Step 3: Removing element at index 12 (ERROR!)
		al.remove(4); // ❌ IndexOutOfBoundsException (Valid indexes: 0 to 3)

		for(String str: al)
		{
			System.out.print(str+" "); // [25, Naresh, A, 37]
		}
	}
}

// Ans-> IndexOutofBoundExceptin

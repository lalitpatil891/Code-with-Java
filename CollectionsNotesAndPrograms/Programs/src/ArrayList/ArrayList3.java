package ArrayList;

import java.util.ArrayList;

record Customer(Integer custId, String custName, Double custSal)
{	
}

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> cust = new ArrayList<>();
		
		cust.add(new Customer(101, "Lalit", 30000.00));
		cust.add(new Customer(102, "Mayur", 40000.00));
		cust.add(new Customer(103, "Sunil", 50000.00));
		cust.add(new Customer(104, "Rahul", 60000.00));
		cust.add(new Customer(105, "Mohit", 20000.00));
		
//		for(Customer c : cust) {
//			System.out.println(c);
//		}
		
		cust.forEach(System.out::println);
	}
}

/**
cust.forEach(...) → here forEach is a default method in the Iterable interface, used to loop through each element.

System.out::println → this is a method reference (shorthand for a lambda expression).

Equivalent to:

cust.forEach(x -> System.out.println(x));

*/

/*
OUTPUT
 
Customer[custId=101, custName=Lalit, custSal=30000.0]
Customer[custId=102, custName=Mayur, custSal=40000.0]
Customer[custId=103, custName=Sunil, custSal=50000.0]
Customer[custId=104, custName=Rahul, custSal=60000.0]
Customer[custId=105, custName=Mohit, custSal=20000.0]
 * */


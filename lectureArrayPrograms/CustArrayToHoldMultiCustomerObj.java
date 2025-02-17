/**10) WAP to create Customer Array to hold multiple customer Object(Manual insertion)  */
package logicalArray.lectureArrayPrograms;

record Customer(Integer id, String name, Double bill)
{
	
}

public class CustArrayToHoldMultiCustomerObj {

	public static void main(String[] args) {
		
		Customer []customers = new Customer[5];
		
		customers[0] = new Customer(12, "Ram", 2000D);
		customers[1] = new Customer(13, "Sham",5000D);
		customers[2] = new Customer(14, "Tara",6000D);
		customers[3] = new Customer(15, "Ravi",7000D);
		customers[4] = new Customer(16, "Raj",8000D);
		
		System.out.println("Print the Customer Data");
		
		for(Customer custo : customers)
		{
			System.out.println(custo);
		}	
	}
}

/*OUTPUT

Print the Customer Data
Customer[id=12, name=Ram, bill=2000.0]
Customer[id=13, name=Sham, bill=5000.0]
Customer[id=14, name=Tara, bill=6000.0]
Customer[id=15, name=Ravi, bill=7000.0]
Customer[id=16, name=Raj, bill=8000.0]

*/
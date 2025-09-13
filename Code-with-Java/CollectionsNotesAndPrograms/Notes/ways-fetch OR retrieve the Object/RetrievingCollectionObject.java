import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

class RetrievingCollectionObject
{
	public static void main(String[] args)
	{

		Vector<String> listOfCity = new Vector<>();

		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");

		System.out.println("1) By Using toString() method:");

		System.out.println(listOfCity.toString());

		System.out.println("----------------------------------");

		System.out.println("2) By using Ordinary for loop :");

		for(int i=0; i<listOfCity.size(); i++) {

			System.out.print(listOfCity.get(i) +" ");

		}

		System.out.println("\n----------------------------------");

		System.out.println("3) By using for Each loop :");

		for(String list : listOfCity)
		{
			System.out.print(list+" " );
		}

		System.out.println("\n----------------------------------");

		System.out.println("4) By using Enumeration interface :");

		Enumeration<String> elist = listOfCity.elements();

		while(elist.hasMoreElements()){

			System.out.print(elist.nextElement() +" 2");
		}

		System.out.println("\n----------------------------------");

		System.out.println("5) By using Iteartor interface :");

		Iterator<String> itr = listOfCity.iterator();
		itr.forEachRemaining(city -> System.out.print(city+" "));



		System.out.println("\n----------------------------------");
		System.out.println("6) By using ListIteartor interface :");

		ListIterator<String> lstItr = listOfCity.listIterator();


		System.out.println("\nIN FORWARD DIRECTION:");

		while(lstItr.hasNext()) {
			System.out.print(lstItr.next() +" ");
		}

		System.out.println("\n\nIN BACKWARD DIRECTION:");

		while(lstItr.hasPrevious()) {
			System.out.print(lstItr.previous() +" ");
		}


		System.out.println("\n----------------------------------");
		System.out.println("7) By using SplIterator interface ");

		Spliterator<String> splItr = listOfCity.spliterator();
		splItr.forEachRemaining(city -> System.out.print(city +" "));

		System.out.println("\n----------------------------------");
		System.out.println("8) By using forEach() Method:");

		listOfCity.forEach(city -> System.out.print(city +" "));

		System.out.println("\n----------------------------------");
		System.out.println("9) By using Method Reference:");

		listOfCity.forEach(city -> System.out.print(city + " "));

		System.out.println("\n----------------------------------");


	}
}


/* OUTPUT--->

1) By Using toString() method:
[Hyderabad, Kolkata, Pune, Indore, Mumbai]
----------------------------------
2) By using Ordinary for loop :
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
3) By using for Each loop :
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
4) By using Enumeration interface :
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
5) By using Iteartor interface :
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
6) By using ListIteartor interface :

IN FORWARD DIRECTION:
Hyderabad Kolkata Pune Indore Mumbai

IN BACKWARD DIRECTION:
Mumbai Indore Pune Kolkata Hyderabad
----------------------------------
7) By using SplIterator interface
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
8) By using forEach() Method:
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
9) By using Method Reference:
Hyderabad Kolkata Pune Indore Mumbai
----------------------------------
*/

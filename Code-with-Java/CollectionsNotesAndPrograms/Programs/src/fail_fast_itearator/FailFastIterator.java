package fail_fast_itearator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Vector;

class Concurrent extends Thread {  //java.util.concurrent
	private Vector<String> cities = null;
	
	public Concurrent(Vector<String> cities) {
		super();
		this.cities =cities;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		cities.add("Ameerpet");
	}
}



public class FailFastIterator {

	public static void main(String[] args) throws InterruptedException {
		
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Pune");
		listOfCity.add("Nashik");
		listOfCity.add("Indore");
		listOfCity.add("Kolkata");
		
		Concurrent c1 = new Concurrent(listOfCity);
		
		c1.start();
		
		Iterator<String> itr = listOfCity.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(500);
		}
		
		System.out.println(".......................");
		
		Spliterator<String> spliterator = listOfCity.spliterator();
		spliterator.forEachRemaining(System.out::println);
	}
}

//Here we will get java.util.ConcurrentModificationException.

/**
 * While retrieving the object from the collection by using Itearor interface or for each loop, if at any point of time the original structure is going to modify after the creation of Itearator then we will get java.util.ConcurrentModificationExacption.*/

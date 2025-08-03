//Array to Collection
package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args)
	{
	
		List<Integer> list = new Vector<>();
		
		int x[] = {22, 20, 10, 40, 15, 58};
		
		//Adding array values to Vector
		for(int i=0; i<x.length; i++) {
				
			list.add(x[i]);
		}
		
		System.out.println("List: "+list);
		
		//----------------------------------------
		Collections.sort(list);
		System.out.println("Sort list: "+list);
		System.out.println("Maximum element is: "+Collections.max(list));
		System.out.println("Minimum element is: "+Collections.min(list));
		
		System.out.print("Vector elements :");
		list.forEach(y -> System.out.print(y +" "));
		
		//------------reverse------------------------
		
		Collections.reverse(list);
		System.out.print("\nReverse List: ");
		list.forEach(y -> System.out.print(y+" "));
		
		//-----how to convert collection to Array--------
		
		Object[] array = list.toArray();
		System.out.println("\nArray: "+Arrays.toString(array));
	}
}


/**
 OUTPUT
 
List: [22, 20, 10, 40, 15, 58]
Sort list: [10, 15, 20, 22, 40, 58]
Maximum element is: 58
Minimum element is: 10
Vector elements :10 15 20 22 40 58 
Reverse List: 58 40 22 20 15 10 
Array: [58, 40, 22, 20, 15, 10]
 */
package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList7 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		System.out.println(list);  //[1, 2, 3, 4, 5, 6, 7, 8]
		
		//list.add(10);    //java.lang.UnsupportedOperationException
 		
		//list.remove(0);  	//java.lang.UnsupportedOperationException
		
		list.set(0, 100);  //// Replace element at index 0
			
		System.out.println(list.size());
		
		System.out.println(list);	//[100, 2, 3, 4, 5, 6, 7, 8]
	}
}

/**1) Fixed length Array :

java.util.Arrays class has provided a predefined static method asList(T ...x), It will create a fixed length array and the return type of this method is List interface. 
In this fixed length array we can't perform add or remove opeartion otherwise we will get  java.lang.UnsupportedOperationException but we can replace the element.
*/

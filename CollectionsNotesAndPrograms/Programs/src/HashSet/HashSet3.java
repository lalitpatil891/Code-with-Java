package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
		Boolean values[] = new Boolean[5];
		
		HashSet<Object> hs = new HashSet<>();
		values[0] = hs.add(12);
		values[1] = hs.add(12);
		values[2] = hs.add("NIT");
		values[3] = hs.add(new String("NIT"));
		values[4] = hs.add(null);
		
		System.out.println(Arrays.toString(values));
		
		System.out.println("------------------------");
		
		if(hs.contains("NIT")) {
			System.out.println("NIT Object is available");
		}
		else
		{
			System.out.println("NIT Object is not Available");
		}
		
		hs.forEach(System.out::println);
	}
}

/**[true, false, true, false, true]
------------------------
NIT Object is available
null
NIT
12*/

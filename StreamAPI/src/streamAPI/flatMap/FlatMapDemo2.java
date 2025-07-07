package streamAPI.flatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");
		List<String> list3 = Arrays.asList("G", "H", "I");
		
		List<List<String>> nestedColl = Arrays.asList(list1, list2, list3);
		System.out.println("Original Nested Collection: "+nestedColl);
		
		List<String> flatColl = nestedColl.stream().flatMap(list -> list.stream()).toList();
		System.out.println(flatColl);
		
	}

}


/**
Original Nested Collection: [[A, B, C], [D, E, F], [G, H, I]]
[A, B, C, D, E, F, G, H, I]
*/
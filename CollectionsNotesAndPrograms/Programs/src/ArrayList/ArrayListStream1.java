package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(20);
		list1.add(21);
		list1.add(22);
		list1.add(23);
		
		
		List<Integer> collect = list1.stream().sorted((x,y) -> y.compareTo(x)).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}

}

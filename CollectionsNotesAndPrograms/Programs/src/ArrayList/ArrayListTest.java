package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);

		list.add(6);
		System.out.println(list);

		list.addFirst(0);
		System.out.println(list);
		
		list.addLast(7);
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		System.out.println(list.contains(100)); 
		
		list.stream().filter(x -> x%2 ==0).forEach(System.out::println);
		
		List<Integer> list2 =list.stream().map(x -> x+10).toList();	
		System.out.println(list2);
		
		Collections.reverse(list2);
		
		System.out.println(list2);
		
	
		
		
		
	
		
	}

}

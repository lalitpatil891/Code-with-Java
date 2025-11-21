package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		List<Integer> list = al.stream().dropWhile(x->x < 5).collect(Collectors.toList());
		System.out.println(list);
	
	}
}

//OUTPUT-> [5, 6, 7, 8, 9, 10]


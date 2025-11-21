package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream2 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("A");
		list1.add("BC");
		list1.add("CDE");
		list1.add("DEFG");
		
		List<String> list = list1.stream().filter(x -> x.length() >=2).peek(x -> {}).toList();
		
		System.out.println(list); //[BC, CDE, DEFG]
	
	}
}


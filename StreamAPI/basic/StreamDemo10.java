package streamAPI.basic;

import java.util.List;

public class StreamDemo10 {

	public static void main(String[] args) {
		
		List<Integer> listOfNum = List.of(89,67,56,34,78,98,23,45);
		
		listOfNum.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("============================");
		
		List<Integer> listOfNumber = List.of(89,67,56,45,23,25);
		
		listOfNumber.stream().sorted((i1,i2) -> i2.compareTo(i1)).forEach(System.out::println);
		
		System.out.println("============================");
		
		
	}

}

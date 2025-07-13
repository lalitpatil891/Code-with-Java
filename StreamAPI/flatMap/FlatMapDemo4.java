//Fetching first character using FlatMap();

package streamAPI.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo4 {

	public static void main(String[] args) {
		
		List<String> listOfNames = Arrays.asList("Jaya", "Aryan", "Virat", "Aakash");
		
		List<Character> list = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).toList();
		
		System.out.println(list);
	}

}

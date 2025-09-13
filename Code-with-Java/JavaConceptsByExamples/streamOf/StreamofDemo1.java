/**
 *  1) Stream.of(T ...values)
 *  
 * 
 */

package streamAPI.streamOf;

import java.util.stream.Stream;

public class StreamofDemo1 {

	public static void main(String[] args) {
		
		Stream<Integer> streamOfInteger = Stream.of(10,20,30,40,50);
		streamOfInteger.forEach(x -> System.out.println(x));
		
		System.out.println("---------------------------------------------");
		
		Stream<String> streamOfString = Stream.of("Lalit", "Mayur","Sunil", "Rahul", "Darshan");
		streamOfString.forEach(System.out::println);
	}

}

/**
 * 4) Stream.generate(Suppiler<T> s)
 * 
 * generate(Supplier<T> s) is a predefined static method of stream interface,
 * which accepts Supplier as a parameter to generate Infinite Stream.
 * 
 * 
 * */

package streamAPI.stream_generate_supplier;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {

		Stream<Double> stream = Stream.generate(() -> Math.random());
		
		stream.forEach(System.out::println);
	
	}

}

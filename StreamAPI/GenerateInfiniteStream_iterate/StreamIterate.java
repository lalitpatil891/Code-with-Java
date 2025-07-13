/***
 * 3) public static Stream iterate(final T seed, unaryOperator<T> u)
 * 
 * Stream interface has provided a predefined static method itereate(final T speed, final unaryOperator <T> u) 
 * to genrate inifinite Stream, Here seed represent the starting point of the Stream and UnaryOperator describes that operand and result both must be same type
 * 
 * 
 */

package streamAPI.GenerateInfiniteStream_iterate;

import java.util.*;
import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		
		
		Stream<Integer> iterate = Stream.iterate(1, n -> n+1);
		
		iterate.forEach(System.out::println);
	
		
	}

}

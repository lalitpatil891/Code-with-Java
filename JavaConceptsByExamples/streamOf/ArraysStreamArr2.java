/**
 * Stream.of();
 * 
 * IntStream / LongStream / DoubleStream
 * 
 * **/

package streamAPI.streamOf;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;


public class ArraysStreamArr2 {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(10, 20, 30, 40, 50);

		intStream.forEach(System.out::println);
		
//		------------------------------------------------
		System.out.println("---------------------------------------");
		
		
		DoubleStream doubleStream = DoubleStream.of(12D, 34D, 55D, 77D, 88D);
		
		doubleStream.forEach(System.out::println); 
		
//		-------------------------------------------------
		System.out.println("---------------------------------------");
		
		
		LongStream longStream = LongStream.of(1L, 2L, 3L, 4L, 5L);
		
		longStream.forEach(num -> System.out.println(num));
		
		
		
	}
}


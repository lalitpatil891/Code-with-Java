package com.nit.StreamAPI_classRoom_program;

import java.util.stream.Stream;

public class ClosedStream {
	
	public static void main(String[] args)
	{
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
		
		stream.forEach(System.out::println); //teminal Operation
		
		stream.forEach(System.out::println);
		//java.lang.IllegalStateException
	}

}

/**
 
Methods of intermediate Operation

1) filter(Predicate<P> T)
2) map(function<T, R> mapper)
3) flatMap(fuction<T, Stream R> mapper)
4) distict()
5) sorted()
6) sorted(Comparator<T> cmp)
7) peek(Consumer<T> cons)
8) limit(long maxSize)
9) skip(long x)
10) takeWhile(Predicate<T> p)
11) dropWhile(Predicate<T> p)

*/
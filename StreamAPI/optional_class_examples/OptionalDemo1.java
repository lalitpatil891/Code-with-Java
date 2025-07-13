/**
 * 
 * 1) public static Optional<T> ofNullable(T x)
 * ---> It will return the object of Optional class with specified value.
 * 		If the specified value is null then this method will return an empty
 * 		object of the optional class.
 * 
 * 2) public boolean isPresent();
 * --->	It will return true, if the value is available in the container
 * 		otherwise it will return false.
 * 
 * */


package streamAPI.optional_class_examples;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {

		String str = null;

		Optional<String> container = Optional.ofNullable(str);

		System.out.println(Optional.ofNullable(str)); 
		//if the value is null then it will return empty.
		//or if the value is present then it will print.
		
		System.out.println(container.isPresent()); //if present the true or else false
		
		if (container.isPresent()) {
			System.out.println(container.get());
		} else {
			System.out.println("No value in the container");
		}

	}

}

package streamAPI.optional_class_examples;

import java.util.Optional;
import java.util.Vector;

public class OptionalDemo5 {

	public static void main(String [] args) {
		
		Vector<Optional<String>> listOfCity = new Vector<>();
		
		listOfCity.add(Optional.of("HYD"));
		listOfCity.add(Optional.of("pune"));
		listOfCity.add(Optional.of("BBSR"));
		listOfCity.add(Optional.of("Mumbai"));
		listOfCity.add(Optional.empty());
		
		for(Optional<String> city: listOfCity) {
			if(city.isPresent()) {
				System.out.println(city.get());
			}
			else
			{
				System.out.println("Value is not available");
			}
		}
		
	}
}

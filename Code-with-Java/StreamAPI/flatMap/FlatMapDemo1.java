package streamAPI.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {

		List<String> ind = Arrays.asList("Virat", "Rohit", "Dhoni", "Siraj");

		List<String> pak = Arrays.asList("Babar", "Rizwan", "Sami", "Shahid");

		List<List<String>> nestedColl = Arrays.asList(ind, pak);
		System.out.println(nestedColl); //[[Virat, Rohit, Dhoni, Siraj], [Babar, Rizwan, Sami, Shahid]]

		List<String> flatColl = nestedColl.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		

		System.out.println(flatColl);
		//[Virat, Rohit, Dhoni, Siraj, Babar, Rizwan, Sami, Shahid]

	}

}

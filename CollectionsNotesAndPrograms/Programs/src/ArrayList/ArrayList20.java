package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList20 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		  list.add(30);
		  list.add(10);
		  list.add(20);
		  list.add(40);

		Collections.sort(list);
		System.out.println(list);  //10 20 30 40
	}

}

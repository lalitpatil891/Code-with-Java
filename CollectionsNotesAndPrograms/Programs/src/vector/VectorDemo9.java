package vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo9 {

	public static void main(String[] args) {
		
		Vector<Integer> num = new Vector<>();
		
		num.add(50);
		num.add(51);
		num.add(52);
		num.add(53);
		num.add(54);
		
		System.out.println(num);
		
		Collections.reverse(num);
		
		System.out.println(num);
	}

}

package vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo8 {

	public static void main(String[] args) {
				
		Vector<String> names = new Vector<>();
		
		names.add("lalit");
		names.add("sunil");
		names.add("mayur");
		names.add("rahul");
		
		System.out.println(names);
		
		names.contains("lalit");	
		
		if(names.contains("lalit")) 
			System.out.println("Lalit working here!");
		else
			System.out.println("Lalit dosen't working here!");
		
		
		
		
	}

}

package ArrayList;

import java.util.ArrayList;

public class ArrayList19 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		  al.add("A");
		  al.add(0, "B");
		  al.add("C");
		  al.remove(1);	
		System.out.println(al); //[B, C]

	}

}

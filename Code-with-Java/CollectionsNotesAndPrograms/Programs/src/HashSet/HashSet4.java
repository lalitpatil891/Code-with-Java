package HashSet;

import java.util.HashSet;

public class HashSet4 {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add(new String("India"));
		hs1.add(new String("India"));
		System.out.println(hs1.size()); //1	
		
		HashSet<StringBuffer> hs2 = new HashSet<StringBuffer>();
		hs2.add(new StringBuffer("Hyd"));
		hs2.add(new StringBuffer("Hyd"));
		System.out.println(hs2.size()); //2
		
		//reason for size mismatch
		String str = new String("Ameerpet");
		System.out.println(str.hashCode() +" : "+str.equals(null));
		
		StringBuffer sb = new StringBuffer("S R nagar");
		System.out.println(sb.hashCode() +" : "+sb.equals(null));		
	}
}

/**String overrides equals() & hashCode() → HashSet detects duplicates → size = 1.

StringBuffer does not override equals() & hashCode() → HashSet treats every object as unique → size = 2.*/

/*OUTPUT
1
2
-1739464871 : false
471910020 : false
*/

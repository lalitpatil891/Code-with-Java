package HashMap;

public class StringClassHashCodeAndEquals {

	public static void main(String[] args) {
		
		 //  String s1 = new String("india");	   
		 //  String s2 = new String("india");
		  
			String s1 = "india";	   
		   String s2 = new String("india");
		
		   
		   System.out.println(s1==s2);
		   System.out.println(s1.equals(s2));
		   System.out.println(s1.hashCode());
		   System.out.println(s2.hashCode());
		   
		   
		
		
	}

}

/* false
true
100346167
100346167  */
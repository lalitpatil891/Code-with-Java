package strings;

public class Test13 {

	public static void main(String[] args) {
		
		 StringBuffer sb = new StringBuffer("11111");
         
		 System.out.println(sb.insert(3, false)); //111false11
		 System.out.println(sb.insert(5, 3.3));		 //111fa3.3lse11 
	     System.out.println(sb.insert(3, false).insert(5, 3.3).insert(7, "One")); //111fa3.One3lsefa3.3lse11
	}

}

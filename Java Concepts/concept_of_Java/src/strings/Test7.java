package strings;

public class Test7 {

	public static void main(String[] args) {

		String s1 = new String("JAVA");

		String s2 = new String("JAVA");

		System.out.println(s1 == s2);	//false

		System.out.println(s1.equals(s2)); //true

		System.out.println(s1 == s2.intern());	//false

		System.out.println(s1.intern() == s2.intern()); //true

		System.out.println(s1.intern() == s2);	//false
	}
}


/* OUTPUT
false
true
false
true
false
*/
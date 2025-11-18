package strings;

public class Test12 {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";

		System.out.println(str.indexOf('a'));	//1

		System.out.println(str.indexOf("Day"));	//20

		System.out.println(str.indexOf('a') + str.indexOf("Day"));	//21
		
		System.out.println(str.indexOf('a', 5));
		
		
		System.out.println(str.replace("a", "A").lastIndexOf('a'));

	}

}

/*
Index : Char
 0 : J
 1 : a
 2 : v
 3 : a
 4 : (space)
 5 : C
 6 : o
 7 : n
 8 : c
 9 : e
10 : p
11 : t
12 : (space)
13 : O
14 : f
15 : (space)
16 : T
17 : h
18 : e
19 : (space)
20 : D
21 : a   ← ★ first 'a' found after index 5
22 : y

*/

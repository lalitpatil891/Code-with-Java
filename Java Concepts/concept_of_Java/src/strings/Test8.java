package strings;

public class Test8 {

	public static void main(String[] args) {
		
		String name ="SUNIL";
		
		System.out.println(name.indent(0));
		System.out.println(name.indent(1));
		System.out.println(name.indent(2));
		System.out.println(name.indent(3));
		System.out.println(name.indent(4));
	}

}


/*
What is indent(int n)?

indent() is a String method added in Java 12.
It is used to add or remove indentation (spaces) at the start of each line.

OUTPUT
SUNIL

 SUNIL

  SUNIL

   SUNIL

    SUNIL



*/
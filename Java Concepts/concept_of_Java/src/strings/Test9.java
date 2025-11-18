package strings;

public class Test9 {
	
	public static void main(String [] args) {
		
		String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};
	     
	    String languages = String.join("_", strings); // join() is a static method in java.lang.String class.
	     
	    System.out.println(languages);  //Java_Python_JavaScript_HTML_CSS

	}
}

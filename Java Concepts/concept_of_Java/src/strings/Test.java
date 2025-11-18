package strings;



public class Test {

	public static void main(String[] args) {
	
		String str = "JavaConceptOfTheDay";
		
		String str2 = str.substring(4);
		
		System.out.println(str2); //ConceptOfTheDay
		
		
		String str3 = str.concat("Lalit");
		
		System.out.println(str3);
		
		
		int a = 'A';
		System.out.println("A asci:"+a);
		
		System.out.println(str.codePointAt(4));
		
		System.out.println("-----------------------------");
		
		 String s = "A".repeat(5);
	     System.out.println(s); //AAAAA
	     
	    System.out.println("----------------------------------");
	     
	    System.out.println("1".concat("2").repeat(5).charAt(7));  //1212121212  -> 2
	     
	    System.out.println("----------------------------------");
	     
	    String string  = "String".replace('i', '8');
	    System.out.println(string); //Str8ng

	    System.out.println("----------------------------------");
	    
	    String st1 = "Lalit";
	    System.out.println(st1.hashCode());
	    String st2 = "Lalit";
	    System.out.println(st2.hashCode());
	    
	    String st3 = new String("Lalit");
	    System.out.println("Lalit "+st3.hashCode());
	    
	    String st4 = new String("Sunil");
	    System.out.println("Sunil "+st4.hashCode());
	    
	    
	    System.out.println(st1 == st2);		//true
	    System.out.println(st1.equals(st2)); //true
	    
	    System.out.println(st1 == st3);    //false
	    System.out.println(st1.equals(st3)); //true
	    
	    System.out.println("Java"== new String("Java")); //false
	    System.out.println("Java".equals("Java"));
	    
	    
	    
	    	
	    
	}

}

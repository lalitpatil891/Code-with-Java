package strings;

public class Test6 {

	public static void main(String[] args) {
		
		String str1 = "Java";
        
        String str2 = str1.intern();
         
        System.out.println(str1 == str2);  //true
         
        System.out.println(str1.equals(str2)); //true
         
        System.out.println(str1.hashCode() == str2.hashCode()); //true
        
        System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(0));
	}

}

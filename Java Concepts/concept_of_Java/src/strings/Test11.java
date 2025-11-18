package strings;

public class Test11 {

	public static void main(String[] args) {
		String string = "JAVA";
        
        StringBuffer sbuffer = new StringBuffer(string);
         
        StringBuilder sBuilder = new StringBuilder(string);
         
        System.out.println(string.equals(sbuffer));  //false
         
        System.out.println(string.equals(sBuilder));	//false	
         
        System.out.println(sbuffer.equals(sBuilder));	//falses
	}

}

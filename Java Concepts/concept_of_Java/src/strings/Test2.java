package strings;

public class Test2 {
	
	public static void main(String [] args) {
		
		String name= "\u2005Lalit\u2005    ";
		
		String name2 = name.strip();

		String name3 = name.trim();
		
		System.out.println(name);
		
		System.out.println(name2.length()+"strip: "+name2); //5strip: Lalit
		
		System.out.println(name3.length()+"trim: "+name3);	//7trim:  Lalit
		
		
	}
}

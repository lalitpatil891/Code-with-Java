package Access_Modifires_Examples;


class Access {
	
	
	private Access() {
		System.out.println("First Constructor");
	}
	
	private Access(int i) {
		System.out.println("second Constructor"+ i);
	}
	
	
	public static void test()
	{
		
		Access a = new Access();
		
		Access a2 = new Access(12);
	
	}
	
}

public class Test {

	public static void main(String[] args) {
		Access.test();		
	}
}

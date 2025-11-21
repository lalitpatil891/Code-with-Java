package static_intializer;

class Cl {
	
    static int x; 
	
	static {
	
		x = 30;
		System.out.println(Cl.x);
	}
}

public class BlankFinalFieldTest {

	public static void main(String[] args) {

		Cl cn = new Cl();
		
		System.out.println("Value of x in main : "+cn.x);
	}

}

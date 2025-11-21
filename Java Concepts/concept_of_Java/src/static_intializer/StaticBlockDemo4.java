package static_intializer;

class DefaultValue {
	static int x;

	static {
		System.out.println("x value is :" + x);  //x Value is : 0
	}
}

public class StaticBlockDemo4 {
	public static void main(String[] args) {
		new DefaultValue();
	}
}

//Note : static variables are also having default value.
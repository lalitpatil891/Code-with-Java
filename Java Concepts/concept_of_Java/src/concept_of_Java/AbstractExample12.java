package concept_of_Java;

/* 
 * 12) Is the below program written correctly? If yes, what will be the output?
 * 
 * Yes, program is written correctly. Output will be,
	AAA
	BBB
	CCC
 * 
 */

abstract class AA {
	{
		System.out.println("AAA");
	}
}

abstract class BB extends AA {
	{
		System.out.println("BBB");
	}
}

class CC extends BB {
	{
		System.out.println("CCC");
	}
}

public class AbstractExample12 {

	public static void main(String[] args) {
		CC cc = new CC();
	
	}
}

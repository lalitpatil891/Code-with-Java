package AbstractClassExamples;

/* 
 * 121121
 * 
 */
 

abstract class AAA {
	abstract int firstMethod(int i );
	
	abstract int secondMethod(int i);
	
	int thirdMethod(int i) {
		return secondMethod(++i); //121122
	}
}

abstract class BBB extends AAA {
	@Override
	int secondMethod(int i) {
		return firstMethod(++i); //121123
	}
}

class CCC extends BBB {
	@Override
	int firstMethod(int i) {  //121124
		return ++i;
	}
}

public class AbstractExample13 {
	
	public static void main(String [] args)
	{
		
	
		CCC c = new CCC();
		System.out.println(c.thirdMethod(121121));//OUTOUT: 121124
		
	}
}


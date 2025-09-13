/**IQ: At the time of creating the array object we get length property so for array variable we have always length property as shown below.*/

//package logicalArray.lectureArrayPrograms;

public class ArrayLength {

	public static void main(String[] args) {
		
		String []str = new String[10];
		
		System.out.println("Length is: "+str.length);	//valid
		
		//System.out.println("Length is: "+str.length());	//Invalid
	}

}

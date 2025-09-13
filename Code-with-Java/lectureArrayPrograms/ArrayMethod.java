package logicalArray.lectureArrayPrograms;

public class ArrayMethod {

	public static void main(String[] args) {
		
		byte []b = new byte[5];
		System.out.println(b.getClass().getName());
		
		short s[] = new short[5];
		System.out.println(s.getClass().getName());
		
		int [] i = new int[5];
		System.out.println(i.getClass().getName());
		
		long [] l = new long[5];
		System.out.println(l.getClass().getName());
		
		double[] d = new double[5];
		System.out.println(d.getClass().getName());
		
		float []f = new float[5];
		System.out.println(f.getClass().getName());
		
		char []c = new char[5];
		System.out.println(c.getClass().getName());
		
		boolean []b1 = new boolean[5];
		System.out.println(b1.getClass().getName());
		
		String []s1 = new String[5];
		System.out.println(s1.getClass().getName());	
	}
}


/**

JNI(Java Native Interface)

JNI follows a specific encoding for Java types.

[B -> byte
[S -> short
[I -> int
[J -> long
[D -> double
[F -> float
[C -> char
[Z -> boolean
[Ljava.lang.String;  -> String

*/
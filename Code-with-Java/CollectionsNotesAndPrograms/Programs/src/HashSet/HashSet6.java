package HashSet;

class Student{
	
}

public class HashSet6 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		}
}


/*Both the Student Objects are different as per equals(Object obj) method so the hashcode will be different which is 
coming from Object class.

=============================
public int hashCode() 
----------------------
It is a predefined non static method of Object class which is used to generate the hashcode of the Object.

hashCode of an object is useful to insert the Object in the Hashtable data structure.

hascode of an object is not meant for comparing two objects

If two Objects are having same hashcode then Object may be same or may not be same.

If two objects are same by using equals(Object obj) method then their hashcode MUST BE SAME.
*/
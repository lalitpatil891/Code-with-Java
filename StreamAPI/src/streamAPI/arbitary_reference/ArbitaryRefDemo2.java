package streamAPI.arbitary_reference;

import java.util.Arrays;

class Person 
{
	String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public int personInstanceMethod1(Person p2)
	{
		return this.name.compareTo(p2.name);
	}
	
	@Override
	public String toString() {
		return "Person [name= "+name+"]";	
	}
}


public class ArbitaryRefDemo2 {

	public static void main(String[] args) {
		
		Person[] personArray = {new Person("Zuber"), new Person("Raj"), new Person("Ankit"), new Person("Abhishek")};
		
		Arrays.sort(personArray, Person::personInstanceMethod1);
		
		System.out.println(Arrays.toString(personArray));
		
	}

}

package com.nit.blank_final_field_demo;

class Student {
	final String name;

	public Student() {
		name = "Scott";
	}

	public Student(String name) {
		this.name = name;
	}
}

public class BlankFinalFieldDemo5 {

	public static void main(String[] args) {

		Student scott = new Student();
		System.out.println(scott.name);
		String nam = scott.name;
		System.out.println(nam);

		Student smith = new Student("Smith");
		System.out.println(smith.name);
	}
}


/*blank final field must be initialized in all the constructor available in the class.*/
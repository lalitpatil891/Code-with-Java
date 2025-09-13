package com.nit.constructor_no_args;

public class Person {
	
	private int personId;
	private String personName;
	
	public Person()
	{
		personId = 111;
		personName = "Scott";
		
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
}

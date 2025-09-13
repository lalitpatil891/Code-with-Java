package com.nit.class_description;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDescription {

	public static void main(String[] args) throws ClassNotFoundException
	{
	  Class cls =	Class.forName(args[0]); //FQN
	  
	  System.out.println("class name is :"+cls.getName());
	  
	  System.out.println("Package Name is :"+cls.getPackageName());
	  
	  System.out.println("Available methods are :");
	   
	  Method[] methods = cls.getDeclaredMethods();
	  int count = 0;
	  
	  for(Method method : methods)
	  {
		  System.out.println(method.getName());
		  count++;
	  }
      System.out.println("Total number of methods are :"+count);
	  
	  System.out.println("Available Fields are :");
	  
	  Field[] fields = cls.getDeclaredFields();
	  count = 0;
	  
	  for(Field field : fields)
	  {
		  count++;
		  System.out.println(field.getName());
	  }
	  
	  System.out.println("Total number of Fields are :"+count);
	  
	               
	}
}

/**Note :- getDeclaredMethods() is a predefined non static method available in java.lang.Class class , the return type of this method is Method array where Method is a predefined class available in java.lang.reflect sub package.

public Method[]  getDeclaredMethods()

getDeclaredFields() is a predefined non static method available in java.lang.Class class , the return type of this method is Field array where Field is a predefined class available in java.lang.reflect sub package.

public Field[]  getDeclaredFields()

Field and Method both the classes are providing getName() method to get the name of the field and Method.*/
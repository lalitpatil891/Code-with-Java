package com.nit.hierarchical_inheritance;

public class Shape {
	
	protected int val;
	
	public Shape(int val)
	{
		super();
		this.val = val;
		System.out.println("val value is: "+val);
	}
}

/*
+-------------------------------------------+
| Start                                     |
+-------------------------------------------+
| User Input -> Radius                      |
|   Circle Constructor                      |
|     -> Shape Constructor (val = radius)   |
|     -> Print "val value is: 5"            |
|   Circle toString -> Area = 78.5          |
|   Print "78.5"                            |
+-------------------------------------------+
| User Input -> Length & Breadth            |
|   Rectangle Constructor                   |
|     -> Shape Constructor (val = length)   |
|     -> Print "val value is: 10"           |
|     -> breadth = 4                        |
|   Rectangle toString -> Area = 40.0       |
|   Print "40.0"                            |
+-------------------------------------------+
| End                                       |
+-------------------------------------------+
*/


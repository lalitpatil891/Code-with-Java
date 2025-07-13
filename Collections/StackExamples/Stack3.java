package com.nit.StackExamples;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		 Stack<Integer> st1 = new Stack<>();
         st1.add(10);
         st1.add(20);      
         st1.forEach(x -> System.out.println(x));

         Stack<String> st2 = new Stack<>();
         st2.add("Java");  
         st2.add("is");
         st2.add("programming");
         st2.add("language"); 
         st2.forEach(x -> System.out.println(x));

         Stack<Character> st3 = new Stack<>();
         st3.add('A');  
         st3.add('B');
         st3.forEach(x -> System.out.println(x));

         Stack<Double> st4 = new Stack<>();
         st4.add(10.5);
         st4.add(20.5);               
         st4.forEach(x -> System.out.println(x));          
         
         for(double s: st4) {
        	 System.out.println(s);
         }

	}

}

package com.nit.StackExamples;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {

		Stack<Integer> num = new Stack<>();

		num.push(40);
		num.push(50);
		num.push(20);
		num.push(10);
		num.push(30);
		

		boolean n = num.empty();
		System.out.println("sdf: "+n);
		
		System.out.println("Stack is: " + num);

		System.out.println("pop is: " + num.pop()); // remove the top element

		System.out.println("Stack is: " + num);

		System.out.println("peek is: " + num.peek()); // print top element without removing in the stack

		
		
		System.out.println("Stack is: " + num);
		
		System.out.println("Stack is empty:" +num.empty());

	}

}

/**

Stack is: [40, 50, 20, 10, 30]
pop is: 30
Stack is: [40, 50, 20, 10]
peek is: 10
Stack is: [40, 50, 20, 10]

*/

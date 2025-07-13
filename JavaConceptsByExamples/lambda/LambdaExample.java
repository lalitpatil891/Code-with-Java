package com.nit.lambda;

interface SquareFinder {
    void findSquare(int num);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        SquareFinder square = (num) -> System.out.println("Square: " + (num * num));
        
        // Calling the method
        square.findSquare(5); // Output: Square: 25
    }
}

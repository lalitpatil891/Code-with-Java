package com.nit.assignment_9;

public class Example24 {
	public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); // 3 spaces for alignment
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*  "); // Star with a trailing space
            }
            System.out.println(); // Move to the next line
        }
    }
}

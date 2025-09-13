package com.nit.today;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNumbersUptogGivenLimit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element");
		int n = sc.nextInt();

		List<Integer> elements = Stream.iterate(sc.nextInt(), s -> sc.nextInt()).limit(n).collect(Collectors.toList());
		System.out.println(elements);

		List<Integer> oddElements = elements.stream().filter(x -> x % 2 != 0).map(y -> y * y * y).toList();

		System.out.println(oddElements);

	}

}

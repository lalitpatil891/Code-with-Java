package com.nit.streamAPI_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(20);
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);

		System.out.println("arrayList before: " + arrayList);

		// typeCasting
		ArrayList<Integer> collect = (ArrayList) arrayList.stream().sorted((x, y) -> y.compareTo(x))
				.collect(Collectors.toList());

		System.out.println("after Sorting : " + collect);

	}
}

/*
 * OUTPUT
 * arrayList before: [20, 21, 22, 23]
 * after Sorting : [23, 22, 21, 20]
 *
 */

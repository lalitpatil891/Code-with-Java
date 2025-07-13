/**
RemoveDuplicateFromListELC
Create a program in java which will merge two lists and remove duplicates

Enter the size of the first list:4
Enter elements: 1 2 3 4
Enter the size of the second list:4
Enter elements: 3 4 5 6
[1, 2, 3, 4, 5, 6]

Sample Input
4 1 2 3 4 4 3 4 5 6

Sample Output
[1, 2, 3, 4, 5, 6]
*/

package com.nit.exam_22_feb_2025;

import java.util.*;

class RemoveDuplicateFromListELC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// System.out.print("Enter list1 size: ");
		int size1 = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < size1; i++) {
			int temp = sc.nextInt();
			list1.add(temp);
		}

		// System.out.print("Enter list2 size: ");
		int size2 = sc.nextInt();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < size2; i++) {
			int temp = sc.nextInt();
			list2.add(temp);
		}

		List<Integer> list3 = new ArrayList<>();

		for (int num : list1) {
			if (!list3.contains(num)) {
				list3.add(num);
			}
		}
		
		for (int num : list2) {
			if (!list3.contains(num)) {
				list3.add(num);
			}
		}

		System.out.println(list3);

		sc.close();
	}
}

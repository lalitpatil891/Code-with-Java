package LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		list.add("Item 5");
		list.add("Item 6");
		list.add("Item 7");
		list.add("Item 9");

		list.add(0, "Item 0");
		list.add(1, "Item 1");
		list.add(8, "Item 8");
		list.add(9, "Item 10");

		System.out.println(list);

		list.remove("Item 5");
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.set(0, "Ajay");
		list.set(1, "Vijay");
		list.set(2, "Anand");
		list.set(3, "Aman");
		list.set(4, "Suresh");
		list.set(5, "Ganesh");
		list.set(6, "Ramesh");

		list.forEach(x -> System.out.println(x));
	}
}

/*
 * [Item 0, Item 1, Item 2, Item 3, Item 4, Item 5, Item 6, Item 7, Item 8, Item
 * 10, Item 9] [Item 0, Item 1, Item 2, Item 3, Item 4, Item 6, Item 7, Item 8,
 * Item 10, Item 9] [Item 0, Item 1, Item 2, Item 3, Item 4, Item 6, Item 7,
 * Item 8, Item 10] [Item 1, Item 2, Item 3, Item 4, Item 6, Item 7, Item 8,
 * Item 10] Ajay Vijay Anand Aman Suresh Ganesh Ramesh Item 10
 */
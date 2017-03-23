package week3_backlogs;

import java.util.*;

public class LinkedListE {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(20);
		list.add(30);
		list.add(50);
		list.peek();
		System.out.println(list.peekLast());
		list.addFirst(24);
		Collection<Integer> collection = new LinkedList<Integer>();
		collection.add(4);
		collection.add(60);
		collection.add(70);
		collection.add(75);
		list.addAll(collection);
		System.out.println(list);
		// list.clear();
		// System.out.println(list);
		list.removeLast();
		list.set(2, 55);
		System.out.println(list);
	}
}

package com.clouderasolutions.java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {

	// Creating a Sample List
	public List<Integer> createSampleList() {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);
		return myList;
	}

	// Iterating using Java < 1.7 or lower version
	public void iterateListBefore() {
		List<Integer> list = createSampleList();
		Iterator iterator = list.iterator();
		while (iterator.hasNext())
			System.out.print(" " + iterator.next());
	}

	// Traversing List using for-each Method in Java 1.8
	public void iterateListAfter() {
		List<Integer> list = createSampleList();
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.print(" " + t);
			}
		});
	}

	// Traversing List using for-each Method in Java 1.8 with implementation in
	// custom Consumer class
	public void iterateListAfterWithClass() {
		List<Integer> list = createSampleList();
		MyConsumer consumer = new MyConsumer();
		list.forEach(consumer);
	}

	public static void main(String[] args) {
		Java8ForEach listIterationWays = new Java8ForEach();

		// 1.0 - Tradition way of Iterating using Iterator
		listIterationWays.iterateListBefore();
		System.out.println();

		/*
		 * 2.0 - Java 8 using new forEach Loop to Iterator using Consumer Object
		 * 
		 * Java 8 has introduced forEach method in java.lang.Iterable interface so that
		 * while writing code we focus on business logic only. forEach method takes
		 * java.util.function.Consumer object as argument, so it helps in having our
		 * business logic at a separate location that we can reuse.
		 */
		// 2.1 - Using inline Consumer object
		listIterationWays.iterateListAfter();
		System.out.println();
		// 2.1 - Using custom MyConsumer class Implementing Consumer Interface
		listIterationWays.iterateListAfterWithClass();
		System.out.println();
	}
}

// Implementation of custom Consumer Class
class MyConsumer implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.print(" " + t);
	}
}
package com.clouderasolutions.java8.functionalinterfaces;

/*
 * Functional Interface is also known as Single Abstract Method 
 * Interfaces or SAM Interfaces. 
 * It is a new feature in Java, which helps to 
 * achieve functional programming approach.
 */
@FunctionalInterface
interface Test {
	void sampleMethod();
}

public class Example1 implements Test {

	@Override
	public void sampleMethod() {
		System.out.println("Hello Test");
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.sampleMethod();
	}
}

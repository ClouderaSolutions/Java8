package com.clouderasolutions.java8.functionalinterfaces;

/*
 * Functional interface can have as many 
 * object class abstract methods, and only one defined abstract method
 */
@FunctionalInterface
interface Test1 {
	void sampleMethod();
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class Example2  implements Test1{

	@Override
	public void sampleMethod() {
		System.out.println("Hello Test");
	}

	public static void main(String[] args) {
		Example2 example1 = new Example2();
		example1.sampleMethod();
	}
}
package com.clouderasolutions.java8.functionalinterfaces;

interface Test6 {
	default void Test6() {
		System.out.println("Helo example");
	}
}

@FunctionalInterface
interface Test7 extends Test6 {
	void Test7();
}

public class MultipleInterfaceInheritance implements Test7 {

	@Override
	public void Test7() {
		System.out.println("Hello example1");
	}
	
	public static void main(String[] args) {
		MultipleInterfaceInheritance example1 = new MultipleInterfaceInheritance();
		example1.Test7();
	}
}
package com.clouderasolutions.java8.functionalinterfaces;

/*
 * A functional interface can extends another interface only when it does not have any abstract method.
 */

@FunctionalInterface
interface Test3 {
	void sampleExample();
}

@FunctionalInterface
interface Test4 extends Test3{
	void sampleExample2();
}

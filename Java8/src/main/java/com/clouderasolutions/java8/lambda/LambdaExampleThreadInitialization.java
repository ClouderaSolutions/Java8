package com.clouderasolutions.java8.lambda;

public class LambdaExampleThreadInitialization extends Thread {

	public static void main(String[] args) {
		ThreadCreationOldWay();
		ThreadCreationLambdaWay();
	}

	/*
	 * New Lambda Expression of initializing thread
	 */
	private static void ThreadCreationLambdaWay() {
		Thread t2 = new Thread(() -> {
			System.out.println("This is a runnable method done in Lambda Expressions > 1.8");
		});
		t2.start();
		
		// Other way
		
		Thread t3 = new Thread(() -> System.out.println("This is runnable method done in single line Lambda expressions > 1.8"));
		t3.start();
	}

	/*
	 * Old way initializing Thread
	 */
	private static void ThreadCreationOldWay() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("This is a runnable method done in old fashion < 1.8");
			}
		});
		t1.start();
	}
}
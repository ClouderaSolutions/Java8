package com.clouderasolutions.java8.lambda;

@FunctionalInterface
interface Reports {
	abstract void healthReports(String disease);
}

public class LambdaExampleSingleParameter {

	public static void main(String[] args) {
		printReportsWithoutLambda();
		printReportsWithlambda();
	}

	private static void printReportsWithlambda() {
		Reports reports = (disease) -> {
			System.out.println("Print reports of the following Disease : " + disease);
		};
		reports.healthReports("Cancer");
	}

	private static void printReportsWithoutLambda() {
		Reports reports = new Reports() {
			
			@Override
			public void healthReports(String disease) {
				System.out.println("Print reports of the following Disease : " + disease);
			}
		};
		reports.healthReports("Fever");
	}

}

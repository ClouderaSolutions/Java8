package com.clouderasolutions.java8.lambda;

@FunctionalInterface
interface Draw {
	abstract String shape();
}

public class LambdaExampleDrawRectangle {

	public static void main(String[] args) {
		printShapeWithoutLambda();
		printShapeWithlambda();
	}

	private static void printShapeWithlambda() {
		// Lambda Way
		Draw draw2 = () -> {
			return "Rectangle created using Lambda functions > 1.8";
		};
		System.out.println(draw2.shape());
	}

	private static void printShapeWithoutLambda() {
		// Old Way
		Draw draw = new Draw() {
			@Override
			public String shape() {
				return "Rectangle created using without Lambda < 1.8";
			}
		};
		System.out.println(draw.shape());
	}

}

package com.bptn.course._27_lambdas._01_lambda_basics;

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

public class LambdaExample2 {

	public static void main(String args[]) {

		LambdaExample2 tester = new LambdaExample2();

		// All of the following lambda declarations will work just fine.
		// See the Functional Interface at the top to see how the types are being
		// controlled for.

		// Lambda working with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// Lambda working without type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// Lambda with a return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// Lambda without a return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
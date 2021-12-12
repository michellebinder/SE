package main;

public class Calculator {

	// changed to double so that the calculator can handle decimals as well
	public double add(double valueOne, double valueTwo) {
		return valueOne + valueTwo;
	}
	
	public double sub(double valueOne, double valueTwo) {
		return valueOne - valueTwo;
	}
	
	public double multiply(double valueOne, double valueTwo) {
		return valueOne * valueTwo;
	}
	
	public double divide(double numerator, double denominator) {
		if (denominator == 0)
			throw new ArrayIndexOutOfBoundsException("ZeroDivisionError");

		return (numerator / denominator);
	}
	
}

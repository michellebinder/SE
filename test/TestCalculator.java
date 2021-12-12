package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

	
	Calculator calculator = new Calculator();

	
	/* setting delta in assertEquals(expected, actual, delta) to 0.0001 to compensate rounding errors
		for calculations of numbers with more than one decimal place */ 
	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(3, calculator.add(2.5, 0.5), 0);
		assertEquals(8.12, calculator.add(-5.55, 13.67), 0.0001);
		assertEquals(-3, calculator.add(2, -5), 0);
		
	}
	
	
	
	/* setting delta in assertEquals(expected, actual, delta) to 0.0001 to compensate rounding errors
	for calculations of numbers with more than one decimal place */ 
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(2, calculator.sub(5,3), 0);
		assertEquals(-5, calculator.sub(5,10), 0);
		assertEquals(7.22, calculator.sub(19.11, 11.89), 0.0001);
	}
	
	
	
	/* setting delta in assertEquals(expected, actual, delta) to 0.0001 to compensate rounding errors
	for calculations of numbers with more than one decimal place */ 
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(10, calculator.multiply(5,2), 0);
		assertEquals(-6, calculator.multiply(-3,2), 0);
		assertEquals(433.3252, calculator.multiply(12.79, 33.88), 0.0001);
	}
	
	
	
	/* setting delta in assertEquals(expected, actual, delta) to 0.0001 to compensate rounding errors
	for calculations of numbers with more than one decimal place */ 
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(2, calculator.divide(10,5), 0);
		assertEquals(-3, calculator.divide(15,-5), 0);
		assertEquals(3.998003992, calculator.divide(100.15, 25.05), 0.0001);
	}
	
	
	
	@Test
	@DisplayName("Cannot divide by zero!")
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> { calculator.divide(2, 0);
		});
	}
	
	
	
	@ParameterizedTest
	@CsvSource({
		"-5, 5",
		"0, 7",
		"-11, 14",
		"1, 2" })
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		int result = valueOne + valueTwo;
		assertEquals(result, valueOne, valueTwo);
	}

}

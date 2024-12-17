package com.assesment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test
	void testEmptyStringReturnsZero() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""), "Empty string should return 0");
	}

	@Test
	void testSingleNumberReturnsValue() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.add("1"), "Single number '1' should return 1");
	}

	@Test
	void testTwoNumbersReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("1,2"), "Two numbers '1,2' should return their sum 3");
	}

	@Test
	void testMultipleNumbersReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(10, calculator.add("1,2,3,4"), "Multiple numbers '1,2,3,4' should return their sum 10");
	}

	@Test
	void testNewlineDelimiterReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(6, calculator.add("1\n2,3"), "Input '1\\n2,3' should return the sum 6");
	}

	@Test
	void testCustomDelimiterReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("//;\n1;2"),
				"Input '//;\\n1;2' should return the sum 3 with custom delimiter ';'");
	}

	@Test
	void testNegativeNumberThrowsException() {
		StringCalculator calculator = new StringCalculator();

		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.add("1,-2,3");
		});
		assertEquals("negative numbers not allowed: -2", exception.getMessage());
	}

	@Test
	void testMultipleNegativeNumbersThrowsException() {
		StringCalculator calculator = new StringCalculator();

		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.add("1,-2,-3,4");
		});
		assertEquals("negative numbers not allowed: -2,-3", exception.getMessage());
	}
}

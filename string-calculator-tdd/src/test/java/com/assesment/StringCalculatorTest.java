package com.assesment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

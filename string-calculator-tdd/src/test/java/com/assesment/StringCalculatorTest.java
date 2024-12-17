package com.assesment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

	@Test
	void testEmptyStringReturnsZero() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""), "Empty string should return 0");
	}
}

package com.assesment;

public class StringCalculator {
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String normalizedInput = numbers.replace("\n", ",");
		String[] parts = normalizedInput.split(",");

		int sum = 0;
		for (String part : parts) {
			sum += Integer.parseInt(part);
		}
		return sum;
	}
}
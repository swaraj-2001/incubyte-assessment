package com.assesment;

public class StringCalculator {
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",|\n";
		String normalizedInput = numbers;

		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			delimiter = numbers.substring(2, delimiterIndex);
			normalizedInput = numbers.substring(delimiterIndex + 1);
		}

		String[] parts = normalizedInput.split(delimiter);
		int sum = 0;

		for (String part : parts) {
			sum += Integer.parseInt(part);
		}

		return sum;
	}
}
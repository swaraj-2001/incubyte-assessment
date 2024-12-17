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
		StringBuilder negativeNumbers = new StringBuilder();

		for (String part : parts) {
			int number = Integer.parseInt(part);
			if (number < 0) {
				if (negativeNumbers.length() > 0) {
					negativeNumbers.append(",");
				}
				negativeNumbers.append(number);
			}
			sum += number;
		}

		if (negativeNumbers.length() > 0) {
			throw new IllegalArgumentException("negative numbers not allowed: " + negativeNumbers);
		}

		return sum;
	}
}
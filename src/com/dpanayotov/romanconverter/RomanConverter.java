package com.dpanayotov.romanconverter;

import java.util.Map.Entry;

public class RomanConverter {

	private static final String REGEX_ROMAN = "^M{0,9}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";

	public static String convert(long number) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Entry<String, Integer> romanDigit : RomanDigitsMapping.getMap()
				.entrySet()) {
			while (number >= romanDigit.getValue()) {
				number -= romanDigit.getValue();
				stringBuilder.append(romanDigit.getKey());
			}
		}
		return stringBuilder.toString();
	}

	public static void decimalToRoman(double decimal) {
		String decimalAsString = decimalToString(decimal);
		System.out.print("\nOriginal number:" + decimal + "\nNumber in roman:"
				+ convert(extractIntegral(decimal)) + ","
				+ (convert(extractFraction(decimalAsString))).toLowerCase()
				+ "\n");
	}

	private static String decimalToString(double decimal) {
		String decimalAsString = String.format("%f", decimal);
		decimalAsString = (decimalAsString.indexOf(",") >= 0 ? decimalAsString
				.replaceAll("\\.?0+$", "") : decimalAsString);
		return decimalAsString;
	}

	private static long extractFraction(String decimalAsString) {
		return Long.parseLong(decimalAsString.substring(
				decimalAsString.indexOf(',') + 1, decimalAsString.length()));
	}

	private static long extractIntegral(double decimal) {
		return (long) decimal;
	}
}

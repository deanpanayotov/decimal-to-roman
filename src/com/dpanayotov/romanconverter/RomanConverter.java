package com.dpanayotov.romanconverter;

import java.util.Map.Entry;

public class RomanConverter {

	private static final String REGEX_ROMAN = "^M{0,9}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";

	public static String decimalToRoman(long decimal) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Entry<String, Integer> romanDigit : RomanDigitsMapping.getMap()
				.entrySet()) {
			while (decimal >= romanDigit.getValue()) {
				decimal -= romanDigit.getValue();
				stringBuilder.append(romanDigit.getKey());
			}
		}
		return stringBuilder.toString();
	}
}

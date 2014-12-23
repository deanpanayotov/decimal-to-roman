package com.dpanayotov.romanconverter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

	public static long romanToDecimal(String roman) {
		if (!roman.matches(REGEX_ROMAN)) {
			throw new IllegalArgumentException(
					"The provided string argument is not a valid roman number!");
		}
		long result = 0;
		StringBuilder sb = new StringBuilder(roman);
		List<Entry<String, Integer>> list = new ArrayList<>(RomanDigitsMapping
				.getMap().entrySet());
		Collections.reverse(list);
		outer: for (Entry<String, Integer> romanDigit : list) {
			while (sb.length() >= romanDigit.getKey().length()
					&& sb.lastIndexOf(romanDigit.getKey()) == sb.length()
							- romanDigit.getKey().length()) {
				result += romanDigit.getValue();
				sb.setLength(sb.length() - romanDigit.getKey().length());
				if (sb.length() == 0) {
					break outer;
				}
			}
		}
		return result;
	}
}

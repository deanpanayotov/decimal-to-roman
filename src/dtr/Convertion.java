package dtr;

import java.util.Map.Entry;

public class Convertion {
	public static String convert(int number) {
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
}

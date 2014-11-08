package dtr;

import java.util.Scanner;
import java.util.Map.Entry;

public class DecimalToRoman {

	private static final String REGEX_ROMAN = "^M{0,9}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
	private static final String REGEX_INTEGER = "^\\d+$";

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

	public static int readInteger() {
		String line = readRegex(
				"Please input an integer, which you want to convert to roman: ",
				"Invalid input, please try again: ", REGEX_INTEGER);
		return Integer.parseInt(line);
	}

	public static String readRoman() {
		return readRegex(
				"Please input a roman number, which you want to convert to an integer: ",
				"Invalid input, please try again: ", REGEX_ROMAN);

	}

	public static String readRegex(String initialMessage, String retryMessage,
			String regex) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(initialMessage);//
		String line = scanner.nextLine();
		while (line.matches(regex)) {
			System.out.println(retryMessage);//
			line = scanner.nextLine();
		}
		scanner.close();
		return line;
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

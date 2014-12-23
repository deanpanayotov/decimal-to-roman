package com.dpanayotov.romanconverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	private static final String REGEX_ROMAN = "^M{0,9}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
	private static final String REGEX_INTEGER = "^\\d+$";

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

	private static long[] listDecimal = { 44, 317, 900, 1543, 4888, 5000 };

	public static void main(String[] args) {
		System.out.println("Some preset examples:\n");
		String[] listRoman = new String[listDecimal.length];
		for (int i = 0; i < listDecimal.length; i++) {
			listRoman[i] = RomanConverter.decimalToRoman(listDecimal[i]);
			System.out.println(listDecimal[i] + " is " + listRoman[i]);
		}
		System.out.println("\nNow reversed:\n");
		for (int i = 0; i < listRoman.length; i++) {
			System.out.println(listRoman[i] + " is "
					+ RomanConverter.romanToDecimal(listRoman[i]));
		}
	}
}

package com.dpanayotov.romanconverter;

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
	
	public static void main(String[] args) {
//		e.decimalToRoman(33.11);
//		e.decimalToRoman(123.456);
//		e.decimalToRoman(444.12);
		RomanConverter.decimalToRoman(18.543);
//		e.decimalToRoman(84);

	}
}

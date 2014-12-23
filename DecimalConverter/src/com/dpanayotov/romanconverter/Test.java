package com.dpanayotov.romanconverter;

public class Test {

	private static int[] listDecimal = { 44, 317, 900, 1543, 4888, 5000 };

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

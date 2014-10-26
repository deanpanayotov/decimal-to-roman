package dtr;

import java.util.Scanner;
import java.util.Map.Entry;

public class DecimalToRoman {
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
	
	public static double readDouble() {
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Insert a decimal number, which you want to convert to roman: ");
		return scan.nextDouble();
	}

	public static int extractFraction(double decimalNumber) {
		double dec = decimalNumber;
		double dec2 = dec;
		int i = 0;

		for (;;) {
			dec *= 10;
			i++;
			if (dec % 1 == 0)
				return (int) (dec % (Math.max((int) (dec2), 1) * Math
						.pow(10, i)));
		}
	}

	public static void decimalToRoman(double decimal) {
		System.out.print("\nOriginal number:" + decimal + "\nNumber in roman:"
				+ convert((int) decimal) + ","
				+ (convert(extractFraction(decimal))).toLowerCase() + "\n");
	}
}

package dtr;

import java.util.Scanner;

public class Extraction {

	public Extraction() {
	}

	public static double input() {
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Insert a decimal number, which you want to convert to roman: ");
		return scan.nextDouble();
	}

	public static int pow(int base, int power) {
		int r = 1;
		for (int x = 0; x < power; x++)
			r *= base;
		return r;
	}

	public static int extractFraction(double decimalNumber) {
		double dec = decimalNumber;
		double dec2 = dec;
		int i = 0;

		for (;;) {
			dec *= 10;
			i++;
			if (dec % 1 == 0)
				return (int) (dec % (Math.max((int) (dec2), 1) * pow(10, i)));
		}
	}

	public static void decimalToRoman(double decimal) {
		Convertion c = new Convertion();
		System.out.print("\nOriginal number:" + decimal + "\nNumber in roman:"
				+ c.convert((int) decimal) + ","
				+ (c.convert(extractFraction(decimal))).toLowerCase() + "\n");
	}
}
package dtr;

import java.util.ArrayList;
import java.util.Iterator;

public class Convertion {
	public static String convert(int number) {
		String result = new String("");
		ArrayList<RomanNumberMapping> rList = new ArrayList<RomanNumberMapping>();
		rList.add(new RomanNumberMapping("MMMMMMMMMM", 10000));
		rList.add(new RomanNumberMapping("M", 1000));
		rList.add(new RomanNumberMapping("CM", 900));
		rList.add(new RomanNumberMapping("D", 500));
		rList.add(new RomanNumberMapping("CD", 400));
		rList.add(new RomanNumberMapping("C", 100));
		rList.add(new RomanNumberMapping("XC", 90));
		rList.add(new RomanNumberMapping("L", 50));
		rList.add(new RomanNumberMapping("XL", 40));
		rList.add(new RomanNumberMapping("X", 10));
		rList.add(new RomanNumberMapping("IX", 9));
		rList.add(new RomanNumberMapping("V", 5));
		rList.add(new RomanNumberMapping("IV", 4));
		rList.add(new RomanNumberMapping("I", 1));

		Iterator<RomanNumberMapping> itr = rList.iterator();
		RomanNumberMapping rN = itr.next();
		while (true) {
			if (number >= rN.getValue()) {
				number -= rN.getValue();
				result += rN.getSymbol();
			} else if (itr.hasNext()) {
				rN = itr.next();
			} else {
				return result;
			}
		}
	}
}

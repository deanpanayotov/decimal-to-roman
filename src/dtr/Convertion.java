package dtr;

import java.util.Iterator;
import java.util.Map.Entry;

public class Convertion {
	public static String convert(int number) {
		StringBuilder stringBuilder = new StringBuilder();
		Iterator<Entry<String, Integer>> iterator = RomanNumbersMapping
				.getMap().entrySet().iterator();
		Entry<String, Integer> rN;
		while (iterator.hasNext()) {
			rN = iterator.next();
			while (number >= rN.getValue()) {
				number -= rN.getValue();
				stringBuilder.append(rN.getKey());
			}
		}
		return stringBuilder.toString();
	}
}

package dtr;

import java.util.Iterator;
import java.util.Map.Entry;

public class Convertion {
	public static String convert(int number) {
		StringBuilder stringBuilder = new StringBuilder();
		Iterator<Entry<String, Integer>> itrerator = RomanNumbersMapping
				.getMap().entrySet().iterator();
		Entry<String, Integer> rN = itrerator.next();
		while (true) {
			if (number >= rN.getValue()) {
				number -= rN.getValue();
				stringBuilder.append(rN.getKey());
			} else if (itrerator.hasNext()) {
				rN = itrerator.next();
			} else {
				return stringBuilder.toString();
			}
		}
	}
}

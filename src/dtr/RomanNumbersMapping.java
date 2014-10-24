package dtr;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumbersMapping {
	private static Map<String, Integer> map;

	public static Map<String, Integer> getMap() {
		if (map == null) {
			map = new LinkedHashMap<>();
			map.put("MMMMMMMMMM", 10000);
			map.put("M", 1000);
			map.put("CM", 900);
			map.put("D", 500);
			map.put("CD", 400);
			map.put("C", 100);
			map.put("XC", 90);
			map.put("L", 50);
			map.put("XL", 40);
			map.put("X", 10);
			map.put("IX", 9);
			map.put("V", 5);
			map.put("IV", 4);
			map.put("I", 1);
		}
		return map;
	}
}

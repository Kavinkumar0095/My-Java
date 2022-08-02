package com.one.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Data {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(10, 20);
		map.put(30, 40);
		map.put(50, 60);

		System.out.println(map);
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}

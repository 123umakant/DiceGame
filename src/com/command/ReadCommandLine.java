package com.command;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ReadCommandLine {

	public static void main(String[] arr) {

		

		SortedMap<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				map.put(arr[i], map.get(arr[i]) + 1);

			} else {

				map.put(arr[i], 1);
			}

		}

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

	
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		System.out.print(temp.toString());

	}

}

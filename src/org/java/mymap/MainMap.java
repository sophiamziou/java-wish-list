package org.java.mymap;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MainMap {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		System.out.println(Arrays.asList(str.split(" ")));
		
		Map<String, Integer> occCounter = new HashMap<>();

		for (String word : str.split(" ")) {
			
			if (occCounter.containsKey(word)) {
				
				occCounter.put(word, occCounter.get(word) + 1);
			} else {
				
				occCounter.put(word, 1);
			}
		}

		System.out.println(occCounter);
	}
}

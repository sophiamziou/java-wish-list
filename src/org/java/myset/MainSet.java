package org.java.myset;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class MainSet {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		Set<Integer> numSet = new HashSet<>();

		while (numSet.size() < 5) {
			int num = rnd.nextInt(12 - 2) + 2;
			numSet.add(num);
		}

		System.out.println("lista di numeri random compresi tra 2 e 12: \n" + numSet);
	}
}

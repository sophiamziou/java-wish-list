package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> wishList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("1 - new wish");
//		String wish = sc.nextLine();
//		wishList.add(wish);
//		System.out.println(wishList);
		
		int userVal = -1;
		
		while (true) {
			System.out.println("1 - Inserire nuovo desiderio");
			System.out.println("2 - Uscire");
			userVal = sc.nextInt();
			
			if (userVal == 2) break;
			
			if (userVal != 1 && userVal != 2) {

				System.out.println("Scelta non compresa, ritentare");
				continue;
			}
			
			if (userVal == 1) {
				sc.nextLine();
				String wish = sc.nextLine();
				wishList.add(wish);
				System.out.println(wishList);
				System.out.println("---------");
			}
		}
		sc.close();
		System.out.println("la tua lista dei desideri: " + wishList);
	}
}

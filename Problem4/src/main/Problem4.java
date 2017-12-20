package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
	public static void main(String[] args) {
		int multiplier1 = 100, multiplier2 = 100, product = 0;
		String productString;
		StringBuilder palindrome = new StringBuilder("");
		List<Integer> integerList = new ArrayList<>();
		while (multiplier1++ < 1000) {
			while (multiplier2++ < 1000) {
				product = multiplier1 * multiplier2;
				productString = Integer.toString(product);
				palindrome.append(productString).reverse();
				if (palindrome.toString().equalsIgnoreCase(productString)) {
					integerList.add(product);
				}
				palindrome.setLength(0);
			}
			multiplier2 = 100;
		}
		System.out.println(Collections.max(integerList));
		
	}
}

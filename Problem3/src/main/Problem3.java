package main;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	public static void main(String[] args) {
		long number = 600851475143L;
		List<Long> longList = new ArrayList<>();
		long counter = 1;
		while (counter++ < number) {
			if (number % counter == 0) {
				longList.add(counter);
			}
			if (counter * counter > number) {
				break;
			}
		}
		System.out.println(longList.toString());
		List<Long> compositeFactors = new ArrayList<>();
		for (long aLong : longList) {
			for (long aLong1 : longList) {
				if (aLong1 % aLong == 0 && aLong1 != aLong) {
					compositeFactors.add(aLong1);
				}
			}
		}
		
		longList.removeAll(compositeFactors);
		System.out.println("Prime factors of " + number + " are: " + longList.toString());
		
	}
}

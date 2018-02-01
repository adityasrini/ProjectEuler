/*
Got this answer from Martin-r at https://codereview.stackexchange.com/a/74900
Bruteforce approach took way too much time and pure Math number theory is going beyond my abilities or interests.
 */

public class Main {
	
	public static void main(String[] args) {
		long number = 1;
		long nextNum = 2;
		int maxDivisors = 500;
		int divisors = 0;
		while (divisors <= maxDivisors) {
			divisors = 0;
			for (long i = 1; i * i <= number; i++) {
				if (number % i == 0) {
					if (i * i < number) {
						divisors += 2; // i and number/i are (different) divisors
					} else {
						divisors += 1; // i == number/i is a divisor
					}
				}
			}
			number += nextNum;
			nextNum++;
		}
		System.out.println(number);
	}
	
	
}
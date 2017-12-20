package main;

public class Problem1 {
	public static void main(String[] args) {
		int number = 999;
		int adder = 0;
		while (number-- > 0) {
			adder += (number % 3 == 0) || (number % 5 == 0) ? number : 0;
		}
		System.out.println(adder);
	}
}

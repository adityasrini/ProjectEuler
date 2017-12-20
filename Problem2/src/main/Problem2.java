package main;

public class Problem2 {
	public static void main(String[] args) {
		int previous = 0;
		int next = 1;
		int sum = 0;
		int evenSum = 0;
		while (sum < 4000000) {
			sum = previous + next;
			evenSum += sum % 2 == 0 ? sum : 0;
			previous = next;
			next = sum;
		}
		System.out.println(evenSum + " evensum");
	}
}

package main;

public class Problem6 {
	public static void main(String[] args) {
		int counter = 0;
		int sumOfSquares = 0;
		int squareOfSum = 0;
		while (++counter <= 100) {
			sumOfSquares += counter * counter;
			squareOfSum += counter;
		}
		squareOfSum *= squareOfSum;
		System.out.println(squareOfSum - sumOfSquares);
		
	}
}

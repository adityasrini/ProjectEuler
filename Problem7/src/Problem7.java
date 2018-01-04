import java.util.stream.IntStream;

public class Problem7 {
	
	public static void main(String[] args) {
		
		int lastResult = 1;
		int primeNum = 0;
		
		for (int i = 0; i <= 10001; i++) {
			boolean condition = true;
			while (condition) {
				//copy last result so "result" is "effectively final" for stream processing.
				//Initializing it here makes it so.
				int result = lastResult;
				condition = IntStream.rangeClosed(2, lastResult / 2)
				
									 .anyMatch(s -> result % s == 0);
				if (!condition) {
					primeNum = lastResult;
				}
				
				lastResult++;
			}
		}
		System.out.println(primeNum);
	}
	
}

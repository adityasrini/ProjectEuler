import java.util.stream.LongStream;

public class Problem10 {
	public static void main(String[] args) {
		LongStream.range(2, 2000000)
				  .parallel()  //Adds a noticeable speed bump and reduces seconds!
				  .filter(Problem10::isPrime)
				  .reduce(Long::sum)
				  .ifPresent(System.out::println);
		
	}
	
	private static boolean isPrime(long i) {
		//This is to hasten the finding of a prime. Reduces calculation time by minutes!
		long squareRoot = Math.round(Math.sqrt((double) i));
		return LongStream.rangeClosed(2, squareRoot)
						 .noneMatch(n -> i % n == 0);
	}
}

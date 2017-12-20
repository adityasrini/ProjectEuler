/*
POST MADE AT PROJECT EULER FORUMS:
Wed, 29 Nov 2017, 17:41:
Learned that brute force doesn't work from the previous problem so I introduced bounds at first between numbers to
iterate through vs starting from 0 to infinity. Then I added checks to see if the number was even (therefore divisible
by at least 2) in the first place. If not, "continue". Lastly, to speed up the discovery, I added a "break" if the
solution was found. Speed at this point was 16s with the upper bound at 1000000000 and the lower bound at 100000000.
Time kept increasing drastically as I dropped the lower bounds by orders of magnitude.

However, adding more prime number checks helped. By checking to see if the number was divisible by 2 and 5, I got the
solution in ~6 seconds. Adding another prime number 3, dropped the solution time to 3.7s no matter how low the bound
was. So I dropped it to 1000 and I made the upper limit close to the int limit. Adding more prime numbers after 2, 3,
and 5, made very little difference to the solution so I stopped adding more. Final solution speed = 2.7 seconds.

*/
package main;

import java.util.ArrayList;
import java.util.List;


public class Problem5 {
	public static void main(String[] args) {
		int numberToCheck = 1000, divisor = 1;
		List<Integer> integerList = new ArrayList<>();
		
		a:
		while (numberToCheck++ < 1000000000) {
			//Optimization step. Check with a few prime numbers to see if they are divisible.
			if (numberToCheck % 2 != 0 || numberToCheck % 5 != 0 || numberToCheck % 3 != 0) {
				continue;
			}
			while (divisor <= 20) {
				if (numberToCheck % divisor == 0) {
					integerList.add(numberToCheck);
					if (integerList.size() == 19) {
						System.out.println(integerList.get(0));
						break a;
					}
				}
				divisor++;
			}
			integerList.clear();
			divisor = 2;
		}
		
	}
}

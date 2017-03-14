package week2;

import java.math.BigInteger;
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/

public class SumOfPrimes {

	public static void main(String[] args) {

		BigInteger sumofPrimes = new BigInteger("2");
		boolean isPrime = true;
		for (int i = 3; i < 2000000; i++) {

			for (int j = 2; j <= (int) Math.sqrt(2000000); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sumofPrimes = sumofPrimes.add(BigInteger.valueOf(i));
			}
			isPrime = true;

		}
		System.out.println("Sum  = " + sumofPrimes);
	}
}

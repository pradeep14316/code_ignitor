package week3_backlogs;
/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

public class PrimeFactors {
	public static void main(String[] args) {

		boolean isPrime = true;
		long max = 600851475143l;
		for (int i = 2; i <= max; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (max % i == 0)
					System.out.println(i);
			}
			isPrime = true;
		}

	}
}
package week1;
/*find all prime numbers upto 10000*/

public class PrimeNumbers {

	public static void main(String[] args) {

		int max = 10000;
		int i, j;
		boolean isPrime = true;

		for (i = 2; i <= max; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
			isPrime = true;
		}
	}

}

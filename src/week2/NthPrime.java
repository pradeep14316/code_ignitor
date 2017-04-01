package week2;
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/

public class NthPrime {

	public static void main(String[] args) {

		int x = 1000;
		int i, j;
		boolean isPrime = true;
int count=0;
		for (i = 2; i <= x; i++) {
		double a= (int)Math.sqrt(i);
				
			for (j = 2; j <a; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
count++;
			}

			isPrime = true;
		
				}
		System.out.println("count:" + count);
		}
}

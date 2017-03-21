package week3_backlogs;
/*By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class FibonacciOPerations {
	public static void main(String[] args) {

		long sumOfEven = 0, previous = 0, next = 1, temp;
		// System.out.println(previous);
		// System.out.println(next);
		while (true) {
			temp = previous + next;
			previous = next;
			next = temp;
			// System.out.println(temp);

			if (temp % 2 == 0) {
				sumOfEven += temp;

			}
			if (temp > 4000000) {

				break;
			}

		}
		System.out.println(sumOfEven);
	}
}
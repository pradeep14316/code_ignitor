package week2;
/*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class SumSquares {

	public static void main(String[] args) {
		int temp1 = 0;
		int sum = 0;

		for (int j = 1; j <= 100; j++) {
			temp1 = temp1 + j;
		}
		int temp2 = temp1 * temp1;
		System.out.println("Square of Sum is= " + temp2);

		int Array1[] = new int[200];

		for (int i = 1; i <= 100; i++) {
			int temp = i * i;
			Array1[i] = temp;
			sum = sum + Array1[i];

		}
		System.out.println("Sum of Squares= " + sum);
		System.out.println("The Difference is= " + (temp2 - sum));
	}
}

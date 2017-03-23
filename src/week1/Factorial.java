package week1;

import java.util.Scanner;
import java.math.BigInteger;
/*find the factorial of a given number*/

public class Factorial {
	public static void main(String[] args) {
		new BigInteger("2");
		int factorial = 1;
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int m = 1; m <= n; m++) {
			factorial = factorial * m;
		}
		System.out.println("factorial value is:" + factorial);
		sc.close();
	}
}

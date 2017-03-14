package week1;

import java.util.*;
/*finding whether the given number is a Armstrong Number*/

public class ArmstrongCheck {

	public static void main(String[] args) {
		System.out.println("enter a no: ");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int a, sum = 0;
		for (a = 1; a <= b; a++) {
			int n = String.valueOf(a).length();
			int num1;
			int temp = a;
			while (temp > 0) {
				num1 = a % 10;
				int x = (int) Math.pow(num1, n);
				num1 = a / 10;
				// num2 = sub2 % 10;// 7
				// num3 = sub2 / 10;// 3

				sum = sum + x;
			}

			if (sum == a)
				System.out.println("the armstrong no. is:" + sum);
		}
		scan.close();
	}
}

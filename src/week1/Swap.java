package week1;

import java.util.Scanner;
/*swapping the inputs*/

public class Swap {

	public static void main(String[] args) {
		System.out.println("enter a no:");

		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();

		System.out.println("enter a no:");

		Scanner scan2 = new Scanner(System.in);
		int b = scan1.nextInt();

		int temp = 0;
		temp = a ^ b;
		a ^= temp;

		System.out.println("after swapping:" + a);
		b ^= temp;
		System.out.println("after swapping:" + b);
		scan1.close();
		scan2.close();
	}

}

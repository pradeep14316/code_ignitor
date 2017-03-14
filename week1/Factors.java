package week1;

import java.util.Scanner;
/*Find all the factors of a given number*/

public class Factors {

	public static void main(String[] args) {
		System.out.println("enter a no:");
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		for (int i = 1; i <= input1; i++) {
			if (input1 % i == 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
package week1;

import java.util.Scanner;
/*using bitwise operator determine if a given number is even or odd*/

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter a no:");

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		a &= 1;
		if (a == 0) {
			System.out.println("given is even ");

		} else {
			System.out.println("given no. is odd");
		}
		scan.close();
	}

}

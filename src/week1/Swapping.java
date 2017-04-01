package week1;

import java.util.Scanner;

/*write a program to swap two given numbers, with and without temporary variable*/
public class Swapping {
	public static void main(String[] args) {
		System.out.println("give an input1:");
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		System.out.println("give an input2:");
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();

		input1 ^= input2;
		input2 ^= input1;
		input1 ^= input2;
		System.out.println(input1);
		System.out.println(input2);

		scan1.close();
		scan2.close();
	}

}

package week1;

import java.util.Scanner;
/*find the sum of digits of a given number*/

public class Division {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int num1 = b % 10;// 25> 5
		int diff = b - num1;// 25-5 20
		int num2 = diff / 10;
		int sum = num1 + num2;
		System.out.println("the sum is:" + sum);
		scan.close();
	}
}
// input 0- 99//
package week1;

import java.util.Scanner;

/*Write program to find the febonacci sequence  for a given number with recursive*/
public class FebonacciWithRecursive {
	Scanner scan = new Scanner(System.in);
	int input1 = scan.nextInt();
	int x = 0, y = 1, temp;
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		System.out.println("enter any no:");
		new FebonacciWithRecursive().febrecu();

	}

	void febrecu() {

		for (int i = 0; i <= input1; i++) {
			temp = x + y;
			x = y;
			y = temp;
			System.out.println(temp);
		}

	}

}

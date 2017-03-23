package week1;

import java.util.Scanner;

/*Write program to find the fibbonaci sequence  for a given number by iterative */
public class Febonacci {

	public static void main(String[] args) {

		int x = 0, y = 1, temp;
		System.out.println("enter a no:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i <= n; i++) {

			temp = x + y;
			x = y;
			y = temp;
			System.out.println(temp);

			scan.close();

		}
	}

}
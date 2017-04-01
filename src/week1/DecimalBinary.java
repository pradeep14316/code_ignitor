package week1;

import java.util.Scanner;
import java.util.*;
/*convert the given decimal to binary*/

public class DecimalBinary {
	public static void main(String[] args) {
		System.out.println("enter any no:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		while (!(a == 0)) {
			int temp = a % 2;
			stack.push(temp);
			a /= 2;

		}
		while (!(stack.isEmpty())) {
			int b = stack.pop();
			System.out.println(b);

			scan.close();
		}
	}

}

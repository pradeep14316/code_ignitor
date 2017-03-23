package week1;

import java.util.*;
/*Stack push Operation*/

public class StackOperation {

	private Scanner scan;

	public static void main(String[] args) {
		new StackOperation().push();
	}

	void push() {

		System.out.println("please Enter how many numbers");
		scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Please Enter Values:");
		for (int i = 0; i < n; i++) {
			Scanner scan1 = new Scanner(System.in);
			int[] x1 = new int[10];
			x1[i] = scan.nextInt();
			System.out.println(x1[i]);
			scan1.close();
		}

	}

}

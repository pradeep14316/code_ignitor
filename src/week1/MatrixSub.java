package week1;

import java.util.Scanner;

//Matrix Subtraction
public class MatrixSub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows");
		int y = scan.nextInt();
		System.out.println("enter number of columns");
		int z = scan.nextInt();

		int a[][] = new int[y][z];
		int b[][] = new int[y][z];
		int sub[][] = new int[y][z];

		System.out.println("enter 1st matrix");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("enter 2nd matrix");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("the subtraction of 2 matrices is:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				System.out.println(sub[i][j]);
			}
		}
		scan.close();
	}
}

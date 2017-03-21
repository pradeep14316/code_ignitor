package week1;

import java.util.Scanner;

/* Matrix Division*/
public class MatrixDiv {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give number of rows");
		int y = scan.nextInt();
		System.out.println("give number of columns");
		int z = scan.nextInt();

		int a[][] = new int[y][z];
		int b[][] = new int[y][z];
		double div[][] = new double[y][z];

		System.out.println("  matrix 1:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println(" matrix 2:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				div[i][j] = (double) a[i][j] / b[i][j];
			}
		}
		System.out.println("the div of 2 matrices is:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				System.out.println(div[i][j]);
			}
		}
		scan.close();
	}
}

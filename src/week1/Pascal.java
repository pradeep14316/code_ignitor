package week1;

import java.util.Scanner;
/*Build a pascal triangle for a level n*/

public class Pascal {

	public static void main(String[] args) {
		int a[] = new int[20];

		int b[] = new int[20];
		System.out.println("enter the level no:");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();

		for (int i = 1; i <= m; i++)// i=1,2
		{
			for (int j = 0; j < i; j++) {// j=0,1
				if (j == 0 || j == (i - 1)) {
					a[j] = 1;// a[0]=1
				} else {
					a[j] = b[j - 1] + b[j];
				}
				System.out.print(a[j]);
			}
			for (int j = 0; j < i; j++) {
				b[j] = a[j];
			}
			System.out.println();
		}
		scan.close();

	}
}

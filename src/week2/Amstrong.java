package week2;

import java.util.Scanner;
/*find the armstrong numbers upto given range*/

public class Amstrong {
	public static void main(String[] args) {

		int n = 0;
		int a = 0, i = 1, temp;
		System.out.println("enter a no.");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		for (int f = 1; f <= x; f++) {
			n = String.valueOf(f).length();
			temp = f;
			while (temp > 0) {

				i = temp % 10;// 371/10=1
				i = (int) Math.pow(i, n);// 1*1*1
				a = a + i;// 0+1
				temp = temp / 10;// 371/10=37
			}
			if (a == f) {
				System.out.println("the given no. is amstrong:" + f);
			}
			a = 0;
			// else{
			// System.out.println("the given no. "+n+" is not an amstrong:");
		}

		input.close();
	}
}

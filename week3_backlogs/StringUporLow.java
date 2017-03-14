package week3_backlogs;

import java.util.Scanner;

public class StringUporLow {
	public static void main(String[] args) {

		System.out.println("eneter any char");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c = str.charAt(0);
		int x = (int) c;
		if (x > 96 && x < 123) {
			System.out.println("entered charcater is Lower Case");
		} else if (x > 65 && x < 91) {
			System.out.println("entered charcater is Upper Case");

		}
		scan.close();
	}
}
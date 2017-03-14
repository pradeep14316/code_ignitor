package week3_backlogs;

public class MulwithoutOper {
	public static void main(String[] args) {

		int num1, num2;
		int product = 0;
		for (num1 = 1; num1 <= 5; num1++) {
			for (num2 = 1; num2 <= 5; num2++) {
				product = product + num1;
				System.out.println(product);
			}
			product = 0;
		}

	}
} 
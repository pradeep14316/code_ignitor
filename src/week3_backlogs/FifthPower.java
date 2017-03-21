package week3_backlogs;

public class FifthPower {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 590490;) {
			for (int i1 = 2; i1 < 355000; i1++) {
				int sumOfPowers = 0;
				int number = i1;
				while (number > 0) {
					int d = number % 10;
					number /= 10;

					int temp = d;
					for (int j = 1; j < 5; j++) {
						temp *= d;
					}
					sumOfPowers += temp;
				}

				if (sumOfPowers == i1) {
					result = i1;
				}

			}
			break;

		}
		System.out.println(result);
	}
}
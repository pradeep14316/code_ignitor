package week3_backlogs;

public class CuriousNumber {

	public static long factorial(long a)

	{
		if (a > 1) {
			return factorial(a - 1) * a;
		} else {
			return 1;
		}

	}

	public static void main(String[] args) {
		long sum;
		long n;
		for (long t = 3;; t++) {
			sum = 0;
			n = t;
			// number is split into digits and found factorial and added into
			// sum
			while (n > 0) {
				long a = n % 10;
				n = n / 10;
				sum = sum + factorial(a);
			}
			if (sum == t) {
				System.out.println(sum);
			}
		}

	}

}


package week2;

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc*/

public class PythagoreanTriplet {
	public static void main(String[] args) {

		int SumofDigits = 1000;// a+b+c=1000
		int ProductofDigits = 0;
		for (int a = 0; a <= SumofDigits / 3; a++)// 0-->333
		{
			for (int b = a + 1; b <= SumofDigits / 2; b++)// 1-->500
			{
				int c = SumofDigits - a - b;
				if (c > 0 || (a * a + b * b == c * c)) {

					System.out.println("value of a= " + a);
					System.out.println("value of b= " + b);
					System.out.println("value of c= " + c);
					ProductofDigits = a * b * c;
				}
			}
		}
		System.out.println("Product of a,b,c= " + ProductofDigits);
	}

}

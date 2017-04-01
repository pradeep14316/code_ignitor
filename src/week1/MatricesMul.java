package week1;
/*perform Matrix operations on matrices A & B
 * Matrix Multiplication*/

public class MatricesMul {
	public static void main(String[] args) {

		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int y[][] = { { 1, 0 }, { 2, 0 }, { 5, 6, } };
		int r[][] = new int[2][2];
		int a = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++)

				{

					a = a + x[i][k] * y[k][j];
				}
				r[i][j] = a;
				a = 0;
				System.out.println(r[i][j]);
			}
		}

	}

}

package week3_backlogs;

public class HashFunction {
	private static int mod = 0;
	private static int array[] = new int[10];

	public static void main(String[] args) {

		HashFunction hash = new HashFunction();
		hash.put(33);
		hash.put(34);
		hash.put(35);
		hash.put(36);
		hash.put(37);
		hash.put(38);
		hash.put(39);
		hash.put(40);
		hash.search(20);
	}

	void search(int input) {
		if (array[mod] == input) {
			System.out.println("Seaarch found at index array[" + mod + "]");
		} else {
			System.out.println("Seaarch not found");
		}
	}

	void hashfunction(int input) {
		int i;
		int n = array.length;
		if (n <= 11 && input > 0) {
			mod = input % 11;
			array[mod] = input;
		} else {
			mod = input % (array.length - 1);
			array[mod] = input;
		}

		for (i = 0; i <= array.length - 1; i++) {
			System.out.println("value at" + "[" + i + "] = " + array[i]);
		}
	}

	void put(int input) {
		hashfunction(input);

	}
}
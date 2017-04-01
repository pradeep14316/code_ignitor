package week3_backlogs;

/*Binary Search*/
public class BinarySearch {
	public static void main(String[] args) {
		int SearchKey = 12;
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		int end = array.length - 1;
		int start = 0;
		int mid;
		while (start < end) {
			mid = (start + end) / 2;
			if (array[mid] == SearchKey) {
				System.out.println(array[mid]);
				break;
			} else if (SearchKey < array[mid]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}
		System.out.println("Number not found");
	}

}
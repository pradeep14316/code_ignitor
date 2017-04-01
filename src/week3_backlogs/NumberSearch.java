package week3_backlogs;

import java.util.Scanner;

public class NumberSearch {
	public static void main(String[] args) {

		System.out.println("eneter the range to search the given number:");
		Scanner scan1 = new Scanner(System.in);
		
		int range = scan1.nextInt();
		System.out.println("eneter the number to be searched:");
		Scanner scan2 = new Scanner(System.in);
		int searchkey = scan2.nextInt();

		for (int i = 0; i <= range; i++) {
			if (i == searchkey) {
				System.out.println("Number found");
				break;}
		scan1.close();
		scan2.close();}
	}
}

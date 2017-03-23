package week3_backlogs;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str1 = str.substring(0, 1).toString();
		String str2 = str.substring(1).toString();
		String str3 = "ay";
		System.out.println(str2 + str1 + str3);

		scan.close();
	}
}

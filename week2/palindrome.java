
package week2;

import java.util.Scanner;

/*determine if given string is palindrome*/
public class palindrome {
	public static void main(String[] args) {

		System.out.println("Enter a String:");
		Scanner scan = new Scanner(System.in);
		StringBuffer a = new StringBuffer();
		String c = "";
		c = a.append(scan.nextLine()).toString();
		String b = "";
		b = a.reverse().toString();
		if (c.equals(b)) {
			System.out.println("it is palindrome");
		}

		else {
			System.out.println("it is not palidrome");
		}
		scan.close();
	}

}
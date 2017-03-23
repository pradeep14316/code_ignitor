package week3_backlogs;

import java.util.Scanner;

public class DecimalToRoman {
	public static void main(String[] args) {
		System.out.println("eneter a number:");
		Scanner scan1 = new Scanner(System.in);
		int input = scan1.nextInt();
		;
		String units[] = { " ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String Tens[] = { " ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String Hundreds[] = { " ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String Thousands[] = { " ", "M", "MC", "MCC", "MCCC" };
		int ten = 0, uni = 0, thou = 0, hund = 0;

		thou = input / 1000;
		hund = (input / 100) % 10;
		ten = (input / 10) % 10;
		uni = input % 10;

		System.out.println("The Roman Number is:  " + Thousands[thou] + Hundreds[hund] + Tens[ten] + units[uni]);
		scan1.close();
	}

}

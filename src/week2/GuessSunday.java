package week2;
/*guess the first day in 2000*/

public class GuessSunday {
	public static void main(String[] args) {
		int Days = 0, LeapDays = 0, decount = 0, count = 0;
		for (int year = 1901; year <= 2000; year++) {

			if (year % 4 == 0) {
				count++;
				System.out.println(year + " is a leap year");

			}

			else {
				decount++;
				System.out.println(year + "  is not a leap year");

			}
		}
		System.out.println(" count" + count);
		System.out.println(" decount" + decount);
		LeapDays += (count * 366);
		Days = decount * 365;
		int SumofDays = LeapDays + Days;
		System.out.println("LeapDays=" + LeapDays);
		System.out.println("Days=" + Days);
		System.out.println(SumofDays);
		if (SumofDays % 7 == 0) {
			System.out.println("then 1st day in 2000 is Monday");
		}
	}
}

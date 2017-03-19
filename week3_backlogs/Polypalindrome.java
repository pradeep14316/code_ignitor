package week3_backlogs;

import java.util.*;

/*Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Polypalindrome {
	public static void main(String[] args) {
		Set<Integer> hash = new TreeSet<Integer>();
		int temp = 0;
		for (int i = 1; i <= 999; i++) {
			for (int j = 1; j <= 999; j++) {
				temp = i * j;

				StringBuffer a = new StringBuffer();
				String c = "";
				c = a.append(temp).toString();
				String b = "";
				b = a.reverse().toString();
				if (c.equals(b)) {
					Integer x = Integer.valueOf(c);
					hash.add(x);

				}
			}
			
		}
System.out.println(hash.size());
System.out.println(hash);}

}

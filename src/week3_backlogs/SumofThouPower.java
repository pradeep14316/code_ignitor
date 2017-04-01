package week3_backlogs;

import java.math.BigInteger;

public class SumofThouPower {
	public static void main(String[] args) {
		BigInteger value = new BigInteger("2");
		BigInteger temp = BigInteger.ZERO;
		BigInteger sum = new BigInteger("0");
		BigInteger i = new BigInteger("10");
		value = value.pow(1000);

		System.out.println("the value is: " + value);
		
		while ( value.compareTo(BigInteger.ZERO)>0) {
			temp = value.mod(i);// 32768%10=8
			value = value.divide(i);
			sum = sum.add(temp);
		}

		System.out.println("the sum is :" + sum);
	}
}

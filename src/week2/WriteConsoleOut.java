package week2;

import java.io.PrintWriter;

public class WriteConsoleOut {
	public static void main(String args[]) {
	int b;
	b = 'A';
	System.out.write(b);
	System.out.write('\n');
PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
		}
		
	
	}

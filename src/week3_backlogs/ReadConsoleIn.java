package week3_backlogs;

// Use a BufferedReader to read characters from the console.
import java.io.*;

public class ReadConsoleIn {
	public static void main(String args[]) throws IOException {
		int c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		// read characters
		do {
			c = br.read();
			System.out.println(c);
		} while (c != 0);
	}
}

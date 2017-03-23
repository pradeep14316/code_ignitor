package iopackage;

import java.io.*;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");

		FileOutputStream n = new FileOutputStream(f);
		String s = "welcome to Java Coding on Output Stream";
		byte b[] = s.getBytes();
		n.write(b);
		n.close();
		System.out.println("successfully written to the file ");

	}
}

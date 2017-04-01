package iopackage;

import java.io.*;

public class Io_pack10 {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("xyz.txt");
		FileOutputStream fout2 = new FileOutputStream("abc.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");

	}
}	
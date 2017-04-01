package iopackage;

import java.io.*;

public class Io_pack8 {

	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("D:\\testin1.txt");
		FileInputStream fin2 = new FileInputStream("D:\\testin2.txt");
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");
	}
}

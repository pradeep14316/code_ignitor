package iopackage;

import java.io.*;
import java.util.*;

public class Io_pack9 {

	public static void main(String args[]) throws IOException {
		// creating the FileInputStream objects for all the files
		FileInputStream fin = new FileInputStream("jkl.txt");
		FileInputStream fin2 = new FileInputStream("abc.txt");
		FileInputStream fin3 = new FileInputStream("lmn.txt");
		FileInputStream fin4 = new FileInputStream("xyz.txt");
		// creating Vector object to all the stream
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fin);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		// creating enumeration object by calling the elements method
		Enumeration<FileInputStream> e = v.elements();
		// passing the enumeration object in the constructor
		SequenceInputStream bin = new SequenceInputStream(e);
		int i = 0;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
		bin.close();
		fin.close();
		fin2.close();
	}
}

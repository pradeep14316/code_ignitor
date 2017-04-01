package iopackage;

import java.io.*;
import java.io.IOException;

public class Io_pack13 {
	public static void main(String[] args) throws IOException {
		try {
			InputStream input = new FileInputStream("xyz.txt");
			DataInputStream inst = new DataInputStream(input);
			int count = input.available();
			byte[] ary = new byte[count];
			inst.read(ary);
			for (byte bt : ary) {
				char k = (char) bt;
				System.out.print(k + "-");
			}
			inst.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
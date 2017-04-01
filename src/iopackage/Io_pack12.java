package iopackage;

import java.io.*;

public class Io_pack12 {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("abc.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeChar('s');
		data.flush();
		data.close();
		System.out.println("Succcess...");
	}

}
	
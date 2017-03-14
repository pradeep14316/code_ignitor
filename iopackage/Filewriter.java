package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		f.createNewFile();
	System.out.println(f.exists());
	FileInputStream n=new FileInputStream("abc.txt");
	System.out.println(n.read());
	

	}

}

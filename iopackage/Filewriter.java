package iopackage;

import java.io.File;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) throws IOException {
		File f=new File("/media/pradeep/_D/lost+found/Sounds","file.txt");
		f.createNewFile();
	System.out.println(f.exists());
		
		
	}

}

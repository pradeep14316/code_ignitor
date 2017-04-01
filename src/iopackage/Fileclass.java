package iopackage;

import java.io.File;

public class Fileclass {
	public static void main(String[] args) {
		int count = 0;
		File f = new File("/media/pradeep/_D/lost+found/Sounds");
		String[] s = f.list();
		for (String s1 : s) {
			File f1 = new File(f, s1);

			if (f1.isFile()) {// isDirectory
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("the total number of files= " + count);
	}

}

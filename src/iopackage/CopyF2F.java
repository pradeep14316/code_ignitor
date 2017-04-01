package iopackage;
import java.io.*;

public class CopyF2F {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("abc.txt");
		File g=new File("file.txt");
		InputStream in=new FileInputStream(f);
		OutputStream out=new FileOutputStream(g);
try{	int c;
	while((c=in.read())!=-1)
	{
	out.write(c);	
	}
	System.out.println("success");
	in.close();
	out.close();
}catch(Exception e){System.out.println("catch");}

	
	}
}

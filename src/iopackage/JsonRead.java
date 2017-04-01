package iopackage;
import java.io.*;
public class JsonRead {
	public static void main(String[] args) throws FileNotFoundException {
		try{
	FileReader in=new FileReader("/home/pradeep/Downloads/got.json");
int a;
			while((a=in.read())!=-1){
		System.out.print((char)a);
	}
	in.close();
		}catch(Exception e){System.out.println(e);}
		
	}

}

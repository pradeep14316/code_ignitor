package iopackage;
import java.io.FileOutputStream;
public class Io_pack1 {
	 
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("abc.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  


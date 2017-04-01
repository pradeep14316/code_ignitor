package iopackage;
import java.io.FileInputStream;
public class Io_pack3 {
    public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("jkl.txt");    
           int i=fin.read();  
           System.out.print((char)i);    
 
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    


}

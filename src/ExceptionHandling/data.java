package ExceptionHandling;
import java.io.*;
public class data {
	public static void main(String[] args) throws IOException {
String filepath ="//home//pradeep//workspace//code_ignitor//file.txt";
try (FileInputStream fis = new FileInputStream(filepath)){
    int length = (int) new File(filepath).length();
    byte[] buffer = new byte[length];
    fis.read(buffer, 0, length);
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
	
	
	
	
	
	
	
	}
}
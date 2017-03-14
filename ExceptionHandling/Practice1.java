package ExceptionHandling;

public class Practice1 {
	public static void main(String[] args){
		System.out.println("hello welocme to java coding");
		
	// java.lang.ArithmeticException
	try{
		System.out.println(10 / 0);
	}catch(Exception e){

	}
		System.out.println("happy Holi");
	}
}

/*
 * output is hello welcome to java coding
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * ExceptionHandling.Prcatice1.main(Prcatice1.java:6)
 */
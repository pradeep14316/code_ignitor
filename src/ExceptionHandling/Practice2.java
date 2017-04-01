package ExceptionHandling;

class InsufficientFundsException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

InsufficientFundsException(String s)
	{
		super(s);
	}
	}
class WithdrawLimitException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

WithdrawLimitException(String s)
	{
	super(s);
	}
	}
public class Practice2 {
public static void main(String[] args) {
int balance=100000;
if (balance >100000)
{throw new WithdrawLimitException("Withdrawl Limit is Exceeded");
	}
else if(balance<100000){
	throw new InsufficientFundsException("Insufficient Funds");
} 
else{
		
	System.out.println("Collect your Cash");
}
}
}
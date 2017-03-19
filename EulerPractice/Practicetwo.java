package EulerPractice;
//euler problems
public class Practicetwo {

	public static void main(String[] args) {
		long x=0,y=1,result=0;
		for(long i=0; i<100;i++){
		long sum=x+y;
		x=y;
		y=sum;
		if(sum%2==0||sum>40000){
			result+=sum;
			
		}
		
	}	
		System.out.println(result);}
}

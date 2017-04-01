package week3_backlogs;

public class Spiral {
	public static void main(String[] args) {
		
		int temp=0;
		int sum=1;
		for(int i=3;i<=1001;i=i+2)
		{
			temp=(4*i*i)-(6*i)+6;
			sum=sum+temp;
		}
		System.out.println(sum);
		
	}
}

package week3_backlogs;

import java.util.Scanner;

public class SetOper {
	private static Scanner scan;

	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		System.out.println("Enter Number of Values of A");
		int n=scan.nextInt();
		int A[] = new int[n];
		int k=n;
		int flag=0;
		
		System.out.println("Enter Values of A");
		for (int i = 0; i < n; i++) 
		{
			A[i] = scan.nextInt();
		}
		System.out.println("Enter Number of Values of B");
		int m=scan.nextInt();
		int B[] = new int[m];
		int c[]=new int[n+m];
		System.out.println("Enter Values of B");
		for (int i = 0; i < m; i++) 
		{
			B[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) 
		{
				c[i]=A[i];
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(B[i]!=A[j])
				{
					flag=1;
										
				}
				else
				{
					flag=0;
					break;
				}
			}
			
			if(flag==1)
			{
				c[k]=B[i];
				k++;
			}	
		}		
		System.out.println("Union");
		for(int i=0;i<k-1;i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.print(c[k-1]);
		System.out.println("");
	}
}
				
//				for (int k = 0; k <= A.length - 1; k++) {
	//				for (int j = 0; j <= B.length - 1; j++) {
		//				if (!(A[k] == B[j])) {
			//				int temp = B[j];
				//			A[i] = temp;
					//		System.out.println(A[i]);

						//}
					//}
				//}
			//}
		//}
	//}
//}

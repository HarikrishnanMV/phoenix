package assignment;

import java.util.Scanner;

class q120
{
	  public static void main(String[ ] args)
		{
		 Scanner obj=new Scanner(System.in);
		
		 System.out.println("Enter the first number");
		 int n=obj.nextInt();
		 System.out.println("Enter the second number");
		  int m=obj.nextInt();
		
		int i,j,count=0,sum=0;
		System.out.println("The prime numbers between the given numbers are:");
		for(i=n;i<m;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					count=1;
			}
			if(count==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
			System.out.println("The sum of the prime numbers is: " +sum);
		}
}




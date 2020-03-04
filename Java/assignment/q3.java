package assignment;

import java.util.*;

public class q3 {
	public static void main(String [] args)
	{
		Scanner obj1=new Scanner(System.in);
		UserMainCode3 obj2=new UserMainCode3();
		int n,num;
		
		
		
		System.out.println("Enter the number:");
		n= obj1.nextInt();
		
	    num=obj2.sumOfSquaresOfEvenDigits(n);
	    
		System.out.println("The sum of squares of even digits is " +num);	

	
	}
}


class UserMainCode3
{
	static int sumOfSquaresOfEvenDigits(int n)
	{
		
int d,sum=0;

while(n>0)
{
	d=n%10;
	if(d%2==0)
	{
	  sum+=d*d;
	}
	
	n=n/10;
}
  return sum;
 

	}
}
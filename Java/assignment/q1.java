package assignment;
import java.util.*;

public class q1 {
	public static void main(String [] args)
	{   int n,r;
	
	UserMainCode obj2=new UserMainCode();
	Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number:");
		n= obj1.nextInt();
		
		if(n>0)
		{
			r=obj2.checkSum(n);
			if(r==1)
				System.out.println("The sum of odd digits is odd.");
			if(r==-1)
				System.out.println("The sum of odd digits is even.");
		}
		else
		{
			System.out.println("Please enter a positive integer !!!");
		}
	}
class UserMainCode
{
	public int checkSum(int num)
	{
int d,sum=0;

while(num>0)
{
	d=num%10;
	if(d%2!=0)
	{
	  sum+=d;
	}
	else 
	{
	continue;
	}
	num=num/10;
}
System.out.println("The sum is " +sum);
   if(sum%2!=0)
	  return 1;
  else
	  return -1;
	}
}
}
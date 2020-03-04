package assignment;
import java.util.*;

public class q7 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		
		int r=reverseNumber(n);
		System.out.println("The reverse of the number is: "+r);
		
		
	}
	
	public static int reverseNumber(int n)
	{
		int rev=0;
		
		while(n>0)
		{
			rev = rev*10 + n%10;
			n=n/10;
		}
		return rev;
	}
}

package assignment;
import java.util.*;

public class q25 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the value of'n' :");
		int n=obj.nextInt();
		System.out.println("Enter the value of 'r' :");
		int r=obj.nextInt();
		
		System.out.println(UserMainCode25.calculateNcr(n,r));
	}

}

class UserMainCode25
{
	static int calculateNcr(int n,int r)
	{
		return fact(n)/ ( fact(r) * fact(n-r) );
	}
	
	static int fact(int n)
	{
		int res=1;
		
		for(int i=2;i<=n;i++)
		{
			res=res * i;
			return res;
		}
		
	}

}
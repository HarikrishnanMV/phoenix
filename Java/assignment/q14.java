package assignment;
import java.util.*;

public class q14
{
	public static void main(String args[])
	{
		int a[]=new int[20];
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=obj.nextInt();
		
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
		   a[i] =obj.nextInt();
		}
			System.out.println("The sum is:");
			System.out.println(getSumOfPower(a));
	}



	public static int getSumOfPower(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=(int)(sum + Math.pow(a[i],i));
			return sum;
		}
	
    }
}




//
//package assignment;
//import java.util.Scanner;
//
//public class q15
//{
//	  public static void main(String args[]) 
//	  {
//	    Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int a[] = new int[n];
//	    for (int i = 0; i < n; i++) 
//	    {
//	      a[i] = sc.nextInt();
//	    }
//	    System.out.println(display(n, a));
//	  }
//	  public static int display(int n, int[] a)
//	  {
//	    {
//	      int sum = 0;
//	      for (int i = 0; i < n; i++)
//	        sum = (int) (sum + Math.pow(a[i], i));
//	      return sum;
//	    }
//	  }
//	
//}
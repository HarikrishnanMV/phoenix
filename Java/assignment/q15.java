package assignment;
import java.util.Scanner;

public class q15
{
	  public static void main(String args[]) 
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for (int i = 0; i < n; i++) 
	    {
	      a[i] = sc.nextInt();
	    }
	    System.out.println(display(n, a));
	  }
	  public static int display(int n, int[] a)
	  {
	    {
	      int sum = 0;
	      for (int i = 0; i < n; i++)
	        sum = (int) (sum + Math.pow(a[i], i));
	      return sum;
	    }
	  }
	
}



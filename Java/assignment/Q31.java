package assignment;

import java.util.*;
public class Q31
{
	  public static void main(String[] args) 
	  {
	    Scanner obj = new Scanner(System.in);
	    int a[] = new int[20];
	    System.out.println("Enter the number of elements in the array:");
	    int n = obj.nextInt();
	    
	    System.out.println("Enter the elements of the array:"); 
	    
	    for (int i = 0; i < n; i++)
	    {
	      a[i] = obj.nextInt();
	    }
	    System.out.println("The sum of squares of even digits and cubes of odd digits is:");
	    System.out.println(UserMainCode31.addEvenOdd(a));
	  }
}  
	

class UserMainCode31
{
	  public static int addEvenOdd(int[] a)
	  {
	    int square = 0, cube = 0;
	    
	    for (int i = 0; i < a.length; i++)
	    	
	      if (a[i] % 2 == 0)
	        square += (a[i] * a[i]);
	      else
	        cube += (a[i] * a[i] * a[i]);
	    
	    return square + cube;
	  }
}


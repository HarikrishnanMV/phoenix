package assignment;

import java.util.Scanner;

class q44  {
	public static void main(String[ ] args)
		{ Scanner obj=new Scanner(System.in);

		  System.out.println("Enter the first number.");
		  int a =obj.nextInt();
		
		  System.out.println("Enter the second number.");
		  int b =obj.nextInt();
		
		  System.out.println("Enter the third number.");
		  int c =obj.nextInt();

			if(a>b && a>c)
				{
				   System.out.println("The largest number is " +a);
				   
				      if(b>c)
				                {	 
				       	System.out.println("The second largest number is " +b);
				                 }
				       else
				              {
					System.out.println("The second largest number is " +c);
				               }
				   
				}
			if(b>a && b>c)
				     {
				      System.out.println("The largest number is " +b);
				       
				        if(a>c)
					  {
					   System.out.println("The second largest number is " +a);
					  }
				        else{
					System.out.println("The second largest number is " +c);
					}
				       
				     }

			else
			      {
			        System.out.println("The largest number is " +c);
			        
			if(b>a)
			          {
			            System.out.println("The second largest number is " +b);
			          }
			 else
			          {
			         System.out.println("The second largest number is " +a);
			          }
			        
		
		 	     }
		}}
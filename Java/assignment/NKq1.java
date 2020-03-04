package assignment;
import java.util.*;

public class NKq1 
{
	public static void main(String args[])
	{
		int marks[]= new int[20];
		int flag=0;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n=obj.nextInt();
		System.out.println("Enter the marks:");
		for(int i=0;i<n;i++)
		{
			marks[i]=obj.nextInt();
			
			if(marks[i]<0) 
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Invalid mark entered !");
		}
		else
		{
		  int max=marks[0];
			 for(int i=1;i<n;i++)
			 {
				if(marks[i]>max)
					{
					max=marks[i];
					}
			 }
			 System.out.println("The highest mark is "+max);
		}
		
		
	}

}


//NB: Find the highest mark.
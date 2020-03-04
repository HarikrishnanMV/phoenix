/*package assignment;

import java.util.*;
public class q6 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=obj.nextLine();
		System.out.println("Enter the value of 'n'.");
		int n=obj.nextInt();
		
		System.out.println(formNewWord());
		
		
	}

	
	
}*/


package assignment;
import java.util.*;

public class q6
{
    public static void main(String[] args)
    {
    	Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = obj.nextLine();
        System.out.println("Enter the value of 'n1'.");
        int n1 = obj.nextInt();
                      
                    
        System.out.println(formNewWord(s1,n1));
       }
       
       
       public static String formNewWord(String s1, int n1)
       {
         int n = 2*n1;
            String s = new String();
         
            if(s1.length()>n)
             {
               s = s1.substring(0,n1) + s1.substring(s1.length()-n1, s1.length());
               return s;
             }
          else
        	 return null;
    }
}              

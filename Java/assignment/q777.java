
package assignment;
import java.util.*;

public class q777
{
    public static void main(String[] args)
    {
    	Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = obj.nextLine();
        System.out.println("Enter the value of 'n':");
        int n = obj.nextInt();
             
        String r=UserMainCode.formNewWord(s,n);
         System.out.println("The new string is: "+r);           
       
       }
}

class UserMainCode{
       
       public static String formNewWord(String s, int n)
       {
         
            String s1 = new String();
         
            if(s.length()>n)
             {
               s1 = s.substring(0,n) + s.substring(s.length()-n,s.length());
               return s1;
             }
          else
        	 return null;
    }
}              

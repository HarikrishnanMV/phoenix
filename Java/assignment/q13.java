package assignment;
import java.util.*;

public class q13 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=obj.nextLine();
		
		System.out.println(UserMainCode13.removeEvenVowels(s));
		
	}

}
 class UserMainCode13
 {
	 static String removeEvenVowels(String s)
	 {
		 StringBuffer sb1=new StringBuffer();
		 
       for(int i=0;i<s.length();i++)
       {
    	   
    	   if((i%2)==0)
               sb1.append(s.charAt(i));
           else if((i%2)!=0)
               if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')                                                    
            if(s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')
                                                        sb1.append(s.charAt(i));
         
       }
       return sb1.toString();
	   
 }

 }

// not working right.
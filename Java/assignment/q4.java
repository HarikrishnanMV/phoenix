package assignment;

import java.util.*;

public class q4 
{
  public static void main(String[] args) 
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a string of even length:");
    String s = obj.nextLine();
    
    String s1 = q4.getMiddleChars(s);
    System.out.println("The middle characters of the string are:");
    System.out.println(s1);
  }
}
 class q4
 {
     static String getMiddleChars(String str)
    {
                StringBuffer sb=new StringBuffer();
                
                 if(str.length()%2==0)
                 {
                 sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
                 }
                 
                 return sb.toString();
    }
 }
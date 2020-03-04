package assignment;

import java.util.*;

public class q5
{ 
	public static void main(String[] args) 
   { 
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter the string:");
    String s=obj.nextLine();
    
    int r = checkCharacters(s); 
    
    if (r == -1) 
        System.out.println("Invalid Input- The string should contain more than one characters. "); 
    else if (r == 1) 
        System.out.println("The first and last characters of the string are equal."); 
    else
        System.out.println("The first and last characters of the string are not equal."); 
   } 
	
	
    public static int checkCharacters(String s) 
    { 
        int n = s.length(); 
        if (n < 2) 
           return -1; 
        if (s.charAt(0) == s.charAt(n-1)) 
           return 1; 
        else
           return 0; 
    } 
  
  
   
} 
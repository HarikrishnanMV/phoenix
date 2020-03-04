package assignment;
import java.util.*;
import java.util.regex.*;

public class NKq5 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the PAN :");
		String s=obj.nextLine();
		int len=s.length();
		
		if(len==10)
		{
			Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
			Matcher matcher=pattern.matcher(s);
			if(matcher.matches())
				System.out.println("Valid PAN !");
			else
				System.out.println("Invalid format  !!");
			
		}
		else
			System.out.println("Invalid format !!");
		
	}
}

//NB: PAN validation.
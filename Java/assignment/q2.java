package assignment;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class q2
{
	public static void main(String args[])
	{
		Scanner obj1=new Scanner(System.in);
		UserMainCode2 obj2=new UserMainCode2();
		System.out.println("Enter the 10-digit number in the format: xxx-xxx-xxxx");
		String s=obj1.nextLine();
		int r=obj2.ValidateNumber(s);
		
		if(r==1)
			System.out.println("Valid number format");
		if(r==-1)
			System.out.println("Invalid number format");
		
	}
	

}

class UserMainCode2 
{
	public int ValidateNumber(String s1)
	{
		Pattern p=Pattern.compile("[0-9][0-9][0-9](-)[0-9][0-9][0-9](-)[0-9][0-9][0-9][0-9]");
				Matcher m=p.matcher(s1);
				
				if(m.find()&&m.group().contentEquals(s1))
				{
					return 1;
				}
				else
				{
					return -1;
				}
				
				
	}
	
}
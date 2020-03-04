package assignment;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q22
{
	public static void main(String args[])
	{
		Scanner obj1=new Scanner(System.in);
		UserMainCode22 obj2=new UserMainCode22();
		System.out.println("Enter the string in the format: CTS-XXX");
		String s=obj1.nextLine();
		int r=obj2.validateString(s);
		
		if(r==1)
			System.out.println("Valid format");
		if(r==-1)
			System.out.println("Invalid format");
		
	}

}
 class UserMainCode22
 {
	 public static int validateString( String s)
	 {

			Pattern p=Pattern.compile("CTS(-)[0-9][0-9][0-9]");
					Matcher m=p.matcher(s);
					
					if(m.find()&&m.group().contentEquals(s))
					
						return 1;
					
					else
					
						return -1;
					
	 }
 }

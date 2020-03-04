package assignment;
import java.util.*;

public class q9 
{
	public static void main(String[] args) 
	{
	 Scanner obj=new Scanner(System.in);
	
	 System.out.println("Enter the date:");
	String s=obj.nextLine();
	 
	int r=UserMainCode9.validateDate(s);
	 if(r==1)
		 System.out.println("Valid date format");
	 else
		 System.out.println("Invalid date format");
	}
}

class UserMainCode9
{
  static int validateDate(String s)
 {
	 if(s.matches("\\d{2}[/\\.\\s]\\d{2}[/\\.\\s]\\d{4}")) 
		 return 1;
	 else
		 return -1;
 }
}
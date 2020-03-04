package my_java;
import java.text.*;
import java.util.Date;


public class date1 {
	public static void main(String [] args)throws ParseException
	{
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat f1= new SimpleDateFormat("E dd MM yyyy ' at ' hh:mm:ss a zzz");
		System.out.println(f1.format(now));
		
		f1 = new SimpleDateFormat("dd.MM.yyyy");
		
		Date d = new Date();
		System.out.println(f1.format(d));
	}
	

}

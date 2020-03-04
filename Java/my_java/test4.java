package my_java;
import java.util.*;

public class test4 {
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Rick");
		list.add("Megan");
		list.add("Daryl");
		list.add("Gillen");
		list.add("Carl");
	
		
  /*  list.forEach(

	(names)-> {System.out.println(names);}
	);
	*/


		/*	
			list.stream();
		     list.filter(s -> s.startsWith("C"));
				list.map(String::toUpperCase);
			list.started();
			list.forEach(System.out::println);
			
		*/

		Stream.off("a1","a2","a3")
		.findFirst();
		.iPresent(System.out::println);
		
		Arrays.stream(new int[] {1,2,3})
		.map(n -> 2 * n + 1)
		.average()
		.iPresent(System.out::println);
		
			
	}		
}


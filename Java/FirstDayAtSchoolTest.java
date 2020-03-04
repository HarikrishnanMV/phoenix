
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FirstDayAtSchoolTest 
{
	FirstDayAtSchool school;
	String[] bag= {"Books","Notebooks","Pens"};
	
	@Before
	public void setUp() throws Exception
	{
			System.out.println("Initializing");
			school = new FirstDayAtSchool();
	}
	@Test
	public void testPrepareMyBag() 
	{
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag,school.prepareMyBag());
	}
	@Test
	public void testCheckMyName()
	{
		System.out.println("Inside test check name()");
		school.checkmyName("Hari");
		assertTrue(school.res);
	}
}

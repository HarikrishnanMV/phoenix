import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class CalculatorTest extends TestCase
	{
		
		public CalculatorTest()
		{
			super();
		}
		
		public void testFact()
		{
			int a=5;
			Calculator cal=new Calculator();
			assertEquals(120,cal.factorial(5));
		}
	
	}



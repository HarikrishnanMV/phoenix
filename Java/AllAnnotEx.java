import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class AllAnnotEx {
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass,executed before all test cases");
	}
	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Using @Before annotations,executed before each test cases");
	}
	
	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass , executed after all test cases");
	}
	
	@After
	public void m4()
	{
		
	}
}

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class,MeasurementTest.class})
//all the test classes are run at the same time.
//RunWith and SuiteClasses are annotations. 
public class AllTests 
{

}

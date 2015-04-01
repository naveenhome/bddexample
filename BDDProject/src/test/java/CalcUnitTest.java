package test.java;
import junit.framework.TestCase;
import main.java.*;

public class CalcUnitTest extends TestCase{
	private int value1=0;
	private int value2=0;
	Calculator calc;
	public CalcUnitTest(String testName) 
	{
		super(testName);
	}
	protected void setUp() throws Exception 
	{
		super.setUp();
		calc = new Calculator(); 
		value1 = 3;
		value2 = 5;
	}
		
	protected void tearDown() throws Exception 
	{
		super.tearDown();
		calc=null;
		value1 = 0;
		value2 = 0;
	}
	public void testAdd() 
	{
		int total = 8;
		int sum = calc.add(value1, value2);
		assertEquals(sum, total);
		}
		public void testFailedAdd() {
		int total = 9;
		int sum = calc.add(value1, value2);
		assertNotSame(sum, total);
		}
		public void testSub() {
		int total = 0;
		int sub = calc.subtract(4, 4);
		assertEquals(sub, total);
		}

}

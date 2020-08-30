import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HelloWorldTest {
	
	static ArrayList<Object> testData;
	
	@BeforeClass
	public static void beforeCla() {
		System.out.println("Before Class.");
	}
	
	@Before
	public void before() {
		System.out.println("Before.");
		testData = new ArrayList<>();
		testData.add(new Object());
	}
	
	@Test
	public void testMethod() {
		System.out.println("First Test.");
	}
	
	@After
	public void after() {
		System.out.println("After.");
		testData = null;
	}
	
	@Ignore
	@Test
	public void testMethod2() {
		System.out.println("Second Test.");
	}
	
	@AfterClass
	public static void afterCla() {
		System.out.println("After Class.");
		/* if(testData == null) {
			System.out.println("TesData is Null.");
		} else System.out.println("TestData is NOT Null."); */
	}
	
}

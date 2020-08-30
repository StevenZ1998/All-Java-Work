// Static import
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {
	
	MyString str;
	
	@Before
	public void before() {
		str = new MyString();
	}
	
	@After
	public void after() {
		str = null;
	}
	
	@Test
	public void reverse() {
	
	String normal = "Hello";
	String expected = "olleH";
	
	assertEquals(expected, str.reverse(normal));
	assertTrue("racecar".equalsIgnoreCase(str.reverse("racecar")));
	
	}
	
	@Test
	public void add() {
		int i = 5;
		int s = 1;
		int expected = i + s;
		
		assertEquals(expected, str.add(i, s));
		
	}
	
}

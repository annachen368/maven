package hello;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class GreeterTest {
	@Test
	public void test() {
		assertTrue(true);
	}

	@Test
	public void test1() {
		Greeter g = new Greeter();
		assertEquals(g.sayHello(),"Hello world!");
	}
}
		


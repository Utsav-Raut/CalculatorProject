package ut;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ms.calc.Calculator;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	static Calculator cl;
	
	@BeforeClass
	public void setUp() {
		cl = new Calculator();
	}
	
	@AfterClass
	public void tearDown() {
		System.gc();
	}
	
	@Test
	public void testAdd() {
		assertTrue(cl.doAdd(1, 2) != 0);
	}
	
	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1)==0);
	}
	
	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2)==18);
	}
	
	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2)==4);
	}
	
}
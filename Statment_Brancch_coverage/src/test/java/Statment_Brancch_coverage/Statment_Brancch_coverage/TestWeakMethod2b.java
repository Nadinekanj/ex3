package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod2b {

	@Test
	public void a_bigger_than_b2() {
		int b=1;
		int a=2;	
		int expectedResult=3;
		int result =WeakClass.WeakMethod2(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}
	
	@Test
	public void b_bigger_than_a2() {
		int b=2;
		int a=1;	
		int expectedResult=3;
		int result =WeakClass.WeakMethod2(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}
	@Test
	public void a_equal_b2() {
		int b=2;
		int a=2;	
		int expectedResult=0;
		int result =WeakClass.WeakMethod2(a, b);
		assertEquals(result,expectedResult,0.001);
	}
}

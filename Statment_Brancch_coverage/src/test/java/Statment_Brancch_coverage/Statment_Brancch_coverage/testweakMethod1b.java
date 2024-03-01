package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakMethod1b {

	@Test
	public void a_bigger_than_b() {
		int b=1;
		int a=2;	
		int expectedResult=3;
		int result =WeakClass.WeakMethod1b(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}
	
	@Test
	public void b_bigger_than_a() {
		int b=2;
		int a=1;	
		int expectedResult=3;
		int result =WeakClass.WeakMethod1b(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}
	
	@Test
	public void b_equal_a() {
		int b=2;
		int a=2;	
		int expectedResult=0;
		int result =WeakClass.WeakMethod1b(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}

}

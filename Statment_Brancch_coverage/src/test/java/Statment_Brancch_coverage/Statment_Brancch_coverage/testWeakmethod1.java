package Statment_Brancch_coverage.Statment_Brancch_coverage; 
import org.junit.Test;

public class testWeakmethod1 {

	/*@Test (expected=java.lang.ArithmeticException.class)
	public void b_bigger_than_a1() {
		int b=2;
		int a=1;	
		int expectedResult=3;
		int result =WeakClass.weakMethod1(a, b);
		assertEquals(result,expectedResult,0.001);
	}*/ 
	
	@Test (expected=java.lang.ArithmeticException.class)
	public void testZerro() {
		int b=0;
		int a=1;	
		System.out.println("nadine");
		WeakClass.WeakMethod1(a, b);
		
	}
/*
	@Test
	public void a_bigger_than_b2a() {
		int b=1;
		int a=2;	
		int expectedResult=3;
		int result =WeakClass2.weakMethod2(a, b);
		assertEquals(result,expectedResult,0.001);
		
		
	}

	*/
}

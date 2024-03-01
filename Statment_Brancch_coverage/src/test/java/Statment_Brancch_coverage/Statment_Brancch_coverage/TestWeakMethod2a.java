package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class TestWeakMethod2a {
	
	
	@Test (expected=java.lang.ArithmeticException.class)
	public void testZerro2() {
		int b=3;
		int a=0;	
		WeakClass.WeakMethod2(a, b);
	}
	
}

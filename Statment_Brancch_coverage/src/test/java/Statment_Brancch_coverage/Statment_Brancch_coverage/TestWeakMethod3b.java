package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod3b {

@Test
public void biggerthan10b() {
	int b=2;
	int a=4;	
	int expectedResult=2;
	int result =WeakClass.WeakMethod3(a, b);
	assertEquals(result,expectedResult,0.001);
	
}


/* @Test (expected=java.lang.ArithmeticException.class)
 public void SmallerThan10() {
	int b=2;
	int a=6;	
	weakMethod3.weakMethod3(a, b);
	
} */
 
 @Test (expected=java.lang.ArithmeticException.class)
 public void testzero3b() {
	int b=0;
	int a=4;	
	WeakClass.WeakMethod3(a, b);
	
}



}

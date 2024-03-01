package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod3a {

@Test
public void biggerthan10() {
	int b=2;
	int a=4;	
	int expectedResult=2;
	int result =WeakClass.WeakMethod3(a, b);
	assertEquals(result,expectedResult,0.001);
}
} 

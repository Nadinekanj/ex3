package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	public static int WeakMethod1 (int a , int b) {
		int c ;
		if (b>a) 
			c=(b+1)/a;
		else if (a>b) 
			c=(a+1)/b;
		else 
			c=0;
		return c ;
	}
	public static int WeakMethod1b (int a , int b) {
		int c ;
		if (b>a) 
			c=(b+1)/a;
		else if (a>b) 
			c=(a+1)/b;
		else 
			c=0;
		return c ;
	}
	
	public static int WeakMethod2 (int a , int b) {
		int c ;
		if (b>a) 
			c=(b+1)/a;
		else if (a>b) 
			c=(a+1)/b;
		else 
			c=0;
		return c ;
	}
	
	public static int WeakMethod3 (int a , int b) {
		int c = 0;
		
		if(a+b>5) {
			c=a+b;

		}
		if (a<5) {
			c=a/b;}
		return c; 
	}
	
}

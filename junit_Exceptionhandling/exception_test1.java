package junit_Exceptionhandling;

import static org.junit.Assert.*;

import org.junit.Test;

public class exception_test1 {
	
	// testing Exception: Excepting an ArithmeticException for division by zero

	@Test(expected = ArithmeticException.class)
	public void testdividebyzero() {
		int a=1/0;
//		fail("Not yet implemented");
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void arrayoutofbound() {
		int[] arr=new int[4];
		arr[20]=10;
	}

}

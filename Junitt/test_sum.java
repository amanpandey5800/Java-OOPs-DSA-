package Junitt;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_sum {
	sum s;
	int[] input= {12,58,2,78};
	
	@Test // it is the test function
	public void test() {
		s=new sum();
		System.out.println("in test 1");
		
		int m=s.getsum(input);
		assertEquals(m,150);  // m = expected value 
	}

}

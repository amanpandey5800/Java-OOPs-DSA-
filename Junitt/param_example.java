package Junitt;
import java.util.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class param_example {
	private int num1,num2,actual_op;
	
	// constructor for taking parameters
	public param_example(int num1,int num2,int actual_op) {
		this.num1=num1;
		this.num2=num2;
		this.actual_op=actual_op;
		System.out.println("in Constructor ");
	}
	// Parameters for the test
	@Parameterized.Parameters
	public static List<Object[] >data(){
		System.out.println("In data method");
		Object b[][] = new Object[][] {
			{1,2,3},
			{4,5,9},
			{5,6,11},
			{-9,-2,-11}
		};
		List<Object[]> c=Arrays.asList(b);
		return c;
	}
	
	// method under test
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	
	
	@Test
	public void test() {
		System.out.println("num 1: " + num1 + " num2 : " + num2 + "expected output : " + actual_op);
		assertEquals(sum(num1,num2),actual_op);
	}

}

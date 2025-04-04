package Junitt;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_even {
	int num=9832;
	even_num s;

	@Test
	public void test() {
		s=new even_num();
		
		System.out.println("testing the function");
		int exp=s.sumofeven(num);
		assertEquals(exp,10);
	}
	
	@Test
	public void test1() {
		s=new even_num();
		int exp1=s.sumofeven(num);
		assertEquals(exp1,11);
	}
}

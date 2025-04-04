package Junitt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSub {

	@Test
	public void test() {
		sub_num a=new sub_num();
		int i=-11;
		int j=-8;
		assertEquals(i-j,a.sub(i, j));
	}
	@Test 
	public void test1() {
		sub_num a=new sub_num();
		int i=10;
		int j=-2;
		assertEquals(i-j,a.sub(i, j));
	}

}

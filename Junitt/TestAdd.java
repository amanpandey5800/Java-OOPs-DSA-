package Junitt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		add_num a=new add_num();
		int i,j;
		i=j=11;
		System.out.println("in test sum with equal values ");
		assertEquals(i+i,a.sum(i, j));
	}
	
	@Test
	public void test1() {
		add_num a =new add_num();
		int i=-11;
		int j=20;
		System.out.println("In test sum with one negative number ");
		assertEquals(i+j,a.sum(i, j));
	}

}

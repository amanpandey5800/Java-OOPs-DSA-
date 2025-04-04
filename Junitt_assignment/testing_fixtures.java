package Junitt_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testing_fixtures {
	
//	private int ai,ds,ml;
//	
//	public testing_avgg(int ai,int ds,int ml) {
//		this.ai=ai;
//		this.ds=ds;
//		this.ml=ml;
//	}
	
	static int[][] arr=new int[][] {
		{20,20,20,20},
		{50,50,50,50},
		{60,60,60,60}
	};
	

	static int r=-1;
	student_dataa d=new student_dataa();
	
	@Before
	public void bf() {
		r=r+1;
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(arr[r][3],d.average(arr[r][0], arr[r][1], arr[r][2]));
	}
	@Test
	public void test2() {
		assertEquals(arr[r][3],d.average(arr[r][0], arr[r][1], arr[r][2]));
}
	@Test
	public void test3() {
		assertEquals(arr[r][3],d.average(arr[r][0], arr[r][1], arr[r][2]));
}
}

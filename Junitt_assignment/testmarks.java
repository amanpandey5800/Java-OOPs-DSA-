package Junitt_assignment;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class testmarks {
	
	
	private int ai;
	private int ds;
	private int ml;
	private int actual_op;


	public testmarks(int ai,int ds,int ml,int actual_op ) {
		this.ai=ai;
		this.ds=ds;
		this.ml=ml;
		this.actual_op=actual_op;
	}
	@Parameterized.Parameters
	public static List<Object[] > data(){
		Object b[][] = new Object[][] {
			{50,50,50,50},
			{60,60,60,60},
			{70,70,70,70},
			{100,100,100,100}
		};
		List<Object[]> c=Arrays.asList(b);
		return c;
		
	}
	student_data d;

	@Test
	public void test() {
		d=new student_data();
		assertEquals(d.average(ai, ds, ml),actual_op);
	}

}

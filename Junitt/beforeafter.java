package Junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class beforeafter {
	
	@BeforeClass
	public static void beforeclass(){
		System.out.println("Beforeclass");
	}
	
	@AfterClass
	public static void afterclass(){
		System.out.println("In Afterclass");
	}
	
	@Before
	public void setup() {
		System.out.println("In setup");
	}
	@After
	public void teardown() {
		System.out.println("In teardown");
	}
	
	@Test
	public void test() {
		System.out.println("Testing");
	}

}

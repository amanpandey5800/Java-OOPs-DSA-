package junit_Exceptionhandling;

import static org.junit.Assert.*;

import org.junit.Test;

public class timeout_test1 {
	
	// Testing Timeout : Test will fail id it takes longer than 1000ms
	

	@Test(timeout=1500)
	public void test() throws InterruptedException {
		// Simulate a task that completes quickly
		Thread.sleep(1200);
//		fail("Not yet implemented");
	}

}

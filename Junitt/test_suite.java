package Junitt;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import org.junit.Test;
//
@RunWith(Suite.class)
@SuiteClasses({
	Junitt.TestAdd.class,
	Junitt.TestSub.class,
})

public class test_suite {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}


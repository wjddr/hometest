package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class testfun {

	@Test
	void testFun() {
		TestCase.assertEquals(test.Demo.fun(2, 3), 5);
	}

}

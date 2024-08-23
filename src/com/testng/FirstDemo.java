package com.testng;
/*
 * What is TestNG?
 * TestNG is an automation testing framework in which NG stands for “Next Generation”.
 * TestNG is inspired by JUnit which uses the annotations (@).
 * TestNG overcomes the disadvantages of JUnit and is designed to make end-to-end testing easy.
 * 
 * Using TestNG, you can generate a proper report, and you can easily come to know
 * how many test cases are passed, failed, and skipped.
 * You can execute the failed test cases separately.
 */

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {
	
	@Test
	public void test1() {
		System.out.println("this test pass");
	}
	
	@Test
	public void test2() {
		System.out.println("this test fail");
		fail();
	}
	@Test
	public void test3() {
		System.out.println("skip test");
		throw new SkipException("self skip");
	}

}

package com.junit;
/*
 * What is Junit?
 * JUnit is an open source Unit Testing Framework for JAVA.
 * It is useful for Java Developers to write and run repeatable tests.
 * Erich Gamma and Kent Beck initially develop it.
 * It is an instance of xUnit architecture.
 * As the name implies, it is used for Unit Testing of a small chunk of code.
 */
import static org.junit.Assert.fail;

import org.junit.Test;


public class FirstDemo {
	
@Test
public void test() {
	System.out.println("This test Is pass");
}
	
@Test
	public void test2() {
		System.out.println("fail test");
		fail();
	}
}

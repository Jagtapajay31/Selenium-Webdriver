package com.junit;

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

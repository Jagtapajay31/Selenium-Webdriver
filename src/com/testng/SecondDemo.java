package com.testng;

import org.testng.annotations.Test;

public class SecondDemo {
	
	@Test(priority = 2)
	public void test() {
		System.out.println("this test pass2");
	}
	
	@Test(priority = 1)
	public void best() {
		System.out.println("this test pass1");
	}
	
	@Test(priority = 0)
	public void fest() {
		System.out.println("this test pass");
	}
	
	@Test(priority = 3)
	public void nest() {
		System.out.println("this test pass3");
	}
}

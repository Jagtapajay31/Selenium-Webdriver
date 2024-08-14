package com.tetsng;

import org.testng.annotations.Test;

public class SecondDemo {
	
	@Test(priority = 2)
	public void test() {
		System.out.println("this test pass");
	}
	
	@Test(priority = 1)
	public void best() {
		System.out.println("this test pass");
	}
	
	@Test(priority = 0)
	public void fest() {
		System.out.println("this test pass");
	}
	
	@Test(priority = 3)
	public void nest() {
		System.out.println("this test pass");
	}
}

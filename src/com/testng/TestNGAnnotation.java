package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeTest 
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test
	public void test() {
		System.out.println("this is first test");
	}
	
	@Test
	public void test1() {
		System.out.println("this is Second test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

}

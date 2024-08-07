package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@Before
	public void before() {
		System.out.println("before method");
	}
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@After
	public void after() {
		System.out.println("after method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}


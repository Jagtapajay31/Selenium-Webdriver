package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGParameter2 extends TestNGParameter {

	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
}

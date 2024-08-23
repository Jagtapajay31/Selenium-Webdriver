	package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JunitWebdriver {
	WebDriver driver;
	@Before
	public void before() throws InterruptedException {
	System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test	
	public void test() throws InterruptedException {
	driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
	Thread.sleep(2000);
	}

	@After
	public void after() throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
	}
}

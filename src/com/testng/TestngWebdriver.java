package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngWebdriver {
	
	WebDriver driver;
	@BeforeTest
	public void before() throws InterruptedException {
	System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test
	public void enterUsername() throws InterruptedException {
	driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
	Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void enterpassword() throws InterruptedException {
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	}
	
	@Test
	public void click() throws InterruptedException {
	driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
	Thread.sleep(2000);
	}

	@AfterTest
	public void after() throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
	}
}


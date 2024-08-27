package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
 WebDriver driver;
 
	@BeforeClass
	public void before() throws InterruptedException {
	System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	}
	
	@Test
	@Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException {
	
	driver.findElement(By.name("user-name")).sendKeys("problem_user");
	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	
	}
	
	@AfterClass
	public void After() {
	driver.close();
	}
}

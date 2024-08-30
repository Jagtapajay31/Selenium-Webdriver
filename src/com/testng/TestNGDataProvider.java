package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	@DataProvider(name = "tops")
	 public Object[][] input() {
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}
	
		@Test(dataProvider = "tops")
	  public void f(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("user-name")).sendKeys("problem_user");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		driver.close();
		}
}

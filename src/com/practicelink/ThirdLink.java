package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThirdLink {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/signin");
		Thread.sleep(2000);
		
		//id not working
//		driver.findElement(By.id("react-select-4-input")).sendKeys("demouser");
//		Thread.sleep(2000);
//		driver.findElement(By.id("react-select-5-input")).sendKeys("tetsingisfun99");
//		Thread.sleep(2000);
//		driver.findElement(By.id("login-btn")).click();
//		Thread.sleep(2000);
		
		//Attribute not working
//		driver.findElement(By.cssSelector("input#user_email_login")).sendKeys("demouser");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#user_password")).sendKeys("tetsingisfun99");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
		
		//XPath
		driver.findElement(By.xpath("//div[@id='react-select-2-input']")).sendKeys("demouser");
		Thread.sleep(2000);
		
		driver.close();
	}

}

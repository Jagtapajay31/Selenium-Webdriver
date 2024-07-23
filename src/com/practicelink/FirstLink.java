package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");//only CSSAttribute
		Thread.sleep(2000);
		
		//Attribute
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ajay@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		//name
//		driver.findElement(By.name("username")).sendKeys("Ajay@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("Hello1234");
//		Thread.sleep(2000);
//		driver.findElement(By.name("Log.in")).click();
//		Thread.sleep(2000);
		
		//CSS
//		driver.findElement(By.cssSelector("input.input")).sendKeys("Ajay@123");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input.button")).click();
//		Thread.sleep(2000);
		
		driver.close();
	}

}

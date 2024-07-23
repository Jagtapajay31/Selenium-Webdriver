package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/");
		Thread.sleep(2000);
		//id
//		driver.findElement(By.id("email")).sendKeys("jay@1010gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("jay#123456");
//		Thread.sleep(2000);
//		driver.findElement(By.id("send2")).click();
//		Thread.sleep(2000);
		
		//name
//		driver.findElement(By.name("login[username]")).sendKeys("jay@1010gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login[password]")).sendKeys("jay#123456");
//		Thread.sleep(2000);
//		driver.findElement(By.name("send")).click();
//		Thread.sleep(2000);
		
		
		//cssid
//		driver.findElement(By.cssSelector("input#email")).sendKeys("jay@1010gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("jay#123456");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button#send2")).click();
//		Thread.sleep(2000);
		
		//CSSClass same class name 
//		driver.findElement(By.cssSelector("input.input-text")).sendKeys("jay@1011gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#input-text")).sendKeys("jay@78945");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button.action login primary")).click();
//		Thread.sleep(2000);
		
		//CSSAttribute
		driver.findElement(By.cssSelector("input[aria-required='true']")).sendKeys("jay@1011gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jay@78945");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='action login primary']")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.close();
	}
}

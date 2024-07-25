package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXPath {
	public static void main(String[] args) throws InterruptedException{
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// //tagname[@attr_name='attr_value']
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
		
		
		// //tagename[text()='text_value']
		
	    String msg= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
		System.out.println("text is: "+ msg);
		Thread.sleep(2000);
		
		driver.close();
		}
} 
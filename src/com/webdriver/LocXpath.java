package com.webdriver;
/*
 * XPath:  	in Selenium is an XML path used for navigation through the HTML structure of the page.
 *  		It is a syntax or language for finding any element on a web page using XML path expression.
 *  		XPath can be used for both HTML and XML documents to find the location of any element on a webpage using HTML DOM structure.
 *  
 *  There are two types of XPath:
 *  1) Absolute XPath/static XPath
 *  2) Relative XPath/dynamic XPath
 */
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class LocXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}

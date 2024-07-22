package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * CSS Attribute:
 * except class and id everything else is attribute
 * tagname[attr_name='attr_value']
 */
public class LocCSSAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Ajay@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123654");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[value='1']")).click();
		Thread.sleep(2000);
		
		driver.close();	
	}
}
package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * What is Alert in Selenium?
 * An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
 * It notifies the user with some specific information or error, 
 * asks for permission to perform certain tasks and it also provides warning messages as well.
 * 
 * type:
 * 1. Simple Alert
 * 2. Prompt Alert
 * 3. Confirmation Alert
 */
public class EleAlert {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		
		Alert a1=driver.switchTo().alert();
		System.out.println("alert msg :"+a1.getText());
//		a1.dismiss();
		a1.accept();
		Thread.sleep(2000);
		
//		Alert a2=driver.switchTo().alert();
		System.out.println("alert msg :"+a1.getText());
		a1.accept();
		Thread.sleep(2000);
		
		driver.close();
	}
}

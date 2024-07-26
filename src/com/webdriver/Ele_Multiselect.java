package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_Multiselect {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement e1=driver.findElement(By.id("fruits"));
		Thread.sleep(2000);
		
		Select s1=new Select(e1);
		
		/*
		 *  select by index
		 *  select by value
		 *  select by visible text
		 */
		
		s1.selectByIndex(1);
		Thread.sleep(2000);
		
		s1.selectByValue("grape");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Banana");
		Thread.sleep(2000);
		
		driver.close();
	}

}

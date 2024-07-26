package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\os\\eclipse-workspace\\Selenium_22_may\\src\\com\\webdriver\\index1.html");
//		driver.get("https://www.geeksforgeeks.org/array-class-in-java/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Click")).click();
//		driver.findElement(By.partialLinkText("Share")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}

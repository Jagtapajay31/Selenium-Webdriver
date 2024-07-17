package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDemo {
	public static void main(String[] args) throws InterruptedException {
		//browser setup
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		//to open empty browser
		WebDriver driver=new EdgeDriver();
		
		//to open a website
		driver.get("https://www.w3schools.com/html/");
		
		Thread.sleep(2000);
		System.out.println("url is :"+driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("title is :"+driver.getTitle());
		
//		driver.close();// to close a tab
		driver.quit();// to close all tab
	}

}
